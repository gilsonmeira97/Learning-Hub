package com.course.SpringBootDemo.service;

import com.course.SpringBootDemo.model.Laptop;
import com.course.SpringBootDemo.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    LaptopRepository repo;

    public void setLaptop(Laptop laptop) {
        repo.save(laptop);
    }

    public boolean isGammingLaptop(Laptop laptop) {
        return true;
    }
}
