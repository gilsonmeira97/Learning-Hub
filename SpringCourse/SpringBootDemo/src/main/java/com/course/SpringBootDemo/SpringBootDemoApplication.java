package com.course.SpringBootDemo;

import com.course.SpringBootDemo.model.Laptop;
import com.course.SpringBootDemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(SpringBootDemoApplication.class, args);

		LaptopService service = context.getBean(LaptopService.class);
		Laptop lap = context.getBean(Laptop.class);
		service.setLaptop(lap);



//		Alien alien = context.getBean(Alien.class);
//		System.out.println(alien.getAge());
//		alien.code();

	}

}
