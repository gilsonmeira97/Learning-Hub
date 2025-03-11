package com.testing.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Alien obj1 = (Alien) context.getBean("alien");
//        obj1.setAge(21);
        System.out.println(obj1.getAge());
        obj1.code();

//        Alien obj2 = (Alien) context.getBean("alien");
//        System.out.println(obj2.age);
//        obj2.code();
    }
}
