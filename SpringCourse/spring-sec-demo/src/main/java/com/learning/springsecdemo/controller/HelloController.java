package com.learning.springsecdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String greeting(HttpServletRequest req) {
        return "Hello World!" + req.getSession().getId();
    }
}
