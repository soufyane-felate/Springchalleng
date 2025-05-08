package com.challenge.challenge.controller;

import com.challenge.challenge.entities.Product;
import com.challenge.challenge.repositories.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private final Repository productRepository;

    public ProductController(Repository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/electronics")
    public List<Product> findAllProductsByCategory() {
        return productRepository.findByCategory("electronique");
    }



}
