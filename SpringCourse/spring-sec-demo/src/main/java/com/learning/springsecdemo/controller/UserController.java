package com.learning.springsecdemo.controller;

import com.learning.springsecdemo.model.User;
import com.learning.springsecdemo.repository.UserRepository;
import com.learning.springsecdemo.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtService jwtService;

    @PostMapping("register")
    public User createUser(@RequestBody User user) {
        User newUser = user;
        BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder(12);
        user.setPassword(bcrypt.encode(user.getPassword()));
        userRepository.save(user);
        return newUser;
    }

    @PostMapping("login")
    public String loginUser(@RequestBody User user) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
        if(authentication.isAuthenticated())
            return jwtService.generateToken(user.getUsername());
        else
            return "Failed";
    }
}
