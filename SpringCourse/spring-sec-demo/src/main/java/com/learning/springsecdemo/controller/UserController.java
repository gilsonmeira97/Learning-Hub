package com.learning.springsecdemo.controller;

import com.learning.springsecdemo.model.User;
import com.learning.springsecdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("register")
    public User createUser(@RequestBody User user) {
        User newUser = user;
        BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder(12);
        user.setPassword(bcrypt.encode(user.getPassword()));
        userRepository.save(user);
        return newUser;
    }
}
