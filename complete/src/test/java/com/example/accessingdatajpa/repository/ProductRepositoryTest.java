package com.example.accessingdatajpa.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.example.accessingdatajpa.entity.Product;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class ProductRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;
    
    @Autowired
    private ProductRepository productRepository;

    @Test
    public void testFindByName() {

        // テストデータの用意
        Product product = new Product(1L, "Test Product", 100);
        entityManager.persist(product);
        // データの反映
        entityManager.flush();

        // "Test Product" という名前の製品を検索
        List<Product> foundProducts = productRepository.findByName("Test Product");

        // Assert that the product was found
        assertThat(foundProducts).hasSize(1);
        assertThat(foundProducts.get(0).getName()).isEqualTo("Test Product");
    }
    
}
