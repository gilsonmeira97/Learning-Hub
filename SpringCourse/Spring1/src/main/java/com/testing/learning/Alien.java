package com.testing.learning;

public class Alien {

    private int age;
    private Computer com;

    Alien() {
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
        this.com = com;
    }

    void code() {
        System.out.println("Coding...");
        com.compile();
    }
}
