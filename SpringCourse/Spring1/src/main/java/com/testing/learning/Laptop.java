package com.testing.learning;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Creating Laptop...");
    }


    @Override
    public void compile() {
        System.out.println("Compiling using laptop");
    }
}
