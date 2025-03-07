const express = require('express');
const mongoose = require('mongoose');
const cors = require('cors');
const jwt = require('jsonwebtoken');
const bcrypt = require('bcrypt');
const dotenv = require('dotenv')

const User = require('./models/User');
const PORT = process.env.PORT || 3000;

dotenv.config()
const app = express();

app.listen(PORT, () => {
    console.log(`Server is running on port: ${PORT}`)
})

app.use(express.json());
app.use(cors());

mongoose.connect(process.env.MONGODB_URL).then(() => {
    console.log("Connected to database!");
}).catch((err) => {
    console.log(err);
})

app.post('/api/signup', async (req, res) => {
    try{
        const{email, password} = req.body;

        const userExists = await User.findOne({email});
        if(userExists) {
            return res.status(400).json({message: 'Email already in use'});
        }
        const hashedPassword = await bcrypt.hash(password, 10);
        const newUser = new User({email, password: hashedPassword});
        
        await newUser.save();
        res.status(201).json({data: email, message: 'User created successfuly.'});
    } catch(error) {
        console.log("Error during signup");
        res.status(500).json({message: 'Server error during signup'});
    }
})

app.post('/api/signin', async (req, res) => {
    try{
        const {email, password} = req.body;

        const user = await User.findOne({email});
        if(user == null)
            return res.status(404).json({message: 'Invalid email or password.2'});

        const isSamePassword = await bcrypt.compare(password, user.password);
        if(!isSamePassword) {
            return res.status(404).json({message: 'Invalid email or password.'});
        }
        
        const token = jwt.sign({
            userId: user._id,
            email: user.email
        }, process.env.JWT_SECRET, {
            expiresIn: '1h'
        });
        
        return res.json({token, user: { email}, message: 'Success login!'});
    } catch(error) {
        res.status(500).json({message: 'Server error during signin'});
    }
})

function authenticateToken(req, res, next){
    const authHeader = req.headers['authorization'];
    const token = authHeader && authHeader.split(' ')[1];

    if(!token) {
        return res.status(401).json({message: 'No token provided, authorization denied.'});
    }
    
    try {
        const decoded = jwt.verify(token, process.env.JWT_SECRET);
        req.user = decoded;
        next();
    } catch (error) {
        return res.status(403).json({message: 'Invalid or expired token.'});
    }
}

app.get('/api/profile', authenticateToken ,async (req, res) => {
    try {
        const userId = req.user.userId;
        const user = await User.findById(userId).select("-password");

        if(!user) {
            return res.status(404).json({message: 'User not found'});
        }

        return res.json(user)
    } catch (error) {
        console.log('Error fetching profile.', error);
        res.status(500).json({message: 'Server error.'})
    }
})