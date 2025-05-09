package com.challenge.challenge.repositories;

import com.challenge.challenge.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ItemRepository extends JpaRepository<Product, Long> {
//challenge 2
    @Query("SELECT i FROM Product i WHERE i.category = :category")
    List<Product> findByCategory(@Param("category") String category);

    @Query("SELECT i FROM Product i WHERE i.price < :maxPrice")
    List<Product> findByLessThen(@Param("maxPrice") double maxPrice);

    @Query(value = "SELECT * FROM item WHERE LOWER(name) = LOWER(:name)", nativeQuery = true)
    List<Product> findByIgnoringCase(@Param("name") String name);
}