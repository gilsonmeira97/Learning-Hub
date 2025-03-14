package com.testing.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("21")
    private int age;
    @Autowired
    @Qualifier("laptop")
    private Computer com;

    public Alien() {
        System.out.println("Creating Alien...");
    }

//    public Alien(int age, Computer com) {
//        this.age = age;
//        this.com = com;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Calling set method...");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        System.out.println("Setting computer...");
        this.com = com;
    }

    void code() {
        System.out.println("Coding...");
        com.compile();
    }
}
