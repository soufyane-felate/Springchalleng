package com.challenge.challenge.repositories;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ItemRepository extends JpaRepository<AbstractReadWriteAccess.Item, Long> {
//challenge 2
    @Query("SELECT i FROM Item i WHERE i.category = :category")
    List<Item> findByCategory(@Param("category") String category);

    @Query("SELECT i FROM Item i WHERE i.price < :maxPrice")
    List<Item> findByLessThen(@Param("maxPrice") double maxPrice);

    @Query(value = "SELECT * FROM item WHERE LOWER(name) = LOWER(:name)", nativeQuery = true)
    List<Item> findByIgnoringCase(@Param("name") String name);
}