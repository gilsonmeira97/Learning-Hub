package com.learning.spring_ecommerce.controller;

import com.learning.spring_ecommerce.model.Product;
import com.learning.spring_ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts() {
        return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/product/name/{productName}")
    public ResponseEntity<Product> getProductByName(@PathVariable String productName){
        Optional<Product> result = service.getByName(productName);
        if(result.isPresent())
            return new ResponseEntity<>(result.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(new Product(), HttpStatus.NOT_FOUND);
    }

    @GetMapping("/product/id/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {
        Optional<Product> product = service.getById(id);
         if(product.isPresent())
             return new ResponseEntity<>(product.get(), HttpStatus.OK);
         else
             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
