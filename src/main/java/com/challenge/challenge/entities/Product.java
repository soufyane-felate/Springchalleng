package com.challenge.challenge.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "category")
    private String category;

    @Column(name = "price")
    private double price;

    @Version
    private Integer version;


}

