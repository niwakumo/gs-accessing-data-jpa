package com.example.accessingdatajpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    private Long productId;
    private String name;
    private int price;

    public Product() {
    }

    public Product(Long productId, String name, int price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public Long getProductId() {
        return productId;
    }
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }


}
