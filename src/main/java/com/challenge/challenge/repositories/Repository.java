package com.challenge.challenge.repositories;

import com.challenge.challenge.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface Repository extends JpaRepository<Product, Long> {
        //challenge 1
        List<Product> findByCategory(String category);
        List<Product> findByLessThen(double maxPrice);
        List<Product> findByIgnoringCase(String name);


}
