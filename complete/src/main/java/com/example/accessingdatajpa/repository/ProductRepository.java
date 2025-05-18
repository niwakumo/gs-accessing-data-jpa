package com.example.accessingdatajpa.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatajpa.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
    
    List<Product> findByName(String name);
    
    Product findById(long id);

    
}
