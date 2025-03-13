package com.testing.learning;

public class Desktop implements Computer {

    Desktop() {
        System.out.println("Creating a desktop");
    }

    @Override
    public void compile() {
        System.out.println("Compiling using desktop");
    }
}
