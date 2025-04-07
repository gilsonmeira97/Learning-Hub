package com.learning.spring_ecommerce.service;

import com.learning.spring_ecommerce.model.Product;
import com.learning.spring_ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository repo;

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Optional<Product> getByName(String name) {
        return Optional.ofNullable(repo.findByName(name));
    }

    public Optional<Product> getById(int id) {
        return repo.findById(id);
    }
}
