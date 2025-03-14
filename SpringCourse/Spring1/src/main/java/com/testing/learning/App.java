package com.testing.learning;

import com.testing.learning.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        /*
         *  Spring with Java-based Config
         * */
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Desktop dt = context.getBean("comp3", Desktop.class);
//        Desktop dt = context.getBean(Desktop.class);
//        dt.compile();
//        Desktop dt1 = context.getBean(Desktop.class);
//        dt1.compile();

        Alien obj1 = (Alien) context.getBean(Alien.class);
        System.out.println(obj1.getAge());
        obj1.code();



        /*
        * Spring with XML
        * */
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//
//        Alien obj1 = (Alien) context.getBean("alien");
//        obj1.setAge(21);
//        System.out.println(obj1.getAge());
//        obj1.code();

//        Computer comp = context.getBean(Computer.class);
//        Desktop desk = context.getBean(Desktop.class);

//        Alien obj2 = (Alien) context.getBean("alien");
//        System.out.println(obj2.age);
//        obj2.code();
    }
}
