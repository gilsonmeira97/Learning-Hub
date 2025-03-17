package com.course.SpringBootDemo.repository;

import com.course.SpringBootDemo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop laptop) {
        System.out.println("The laptop was saved");
    }
}
