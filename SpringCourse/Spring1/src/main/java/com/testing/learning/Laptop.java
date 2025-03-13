package com.testing.learning;

public class Laptop implements Computer {
    Laptop() {
        System.out.println("Creating Laptop...");
    }


    @Override
    public void compile() {
        System.out.println("Compiling using laptop");
    }
}
