package com.testing.learning;

public class Alien {

    private int age;
    private Laptop laptop;

    Alien() {
        System.out.println("Creating Alien...");
    }

    public Alien(int age, Laptop laptop) {
        this.age = age;
        this.laptop = laptop;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Calling set method...");
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    void code() {
        System.out.println("Coding...");
        laptop.compile();
    }
}
