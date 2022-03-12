package com.example.productmicroservice;

import com.example.productmicroservice.model.Category;
import com.example.productmicroservice.model.Product;
import com.example.productmicroservice.repositories.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Date;
import java.util.List;

@DataJpaTest
public class ProductRepositoryMockTest {

    private final ProductRepository productRepository;

    public ProductRepositoryMockTest(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Test
    public void whenFindByCategory_thenReturnProductsList(){
        Product product1 = Product.builder().
                name("computer").
                category(Category.builder().id(1L).build()).
                description("").
                stock(Double.parseDouble("10")).
                price(Double.parseDouble("1240")).
                status("Created").
                createdAt(new Date()).build();
        productRepository.save(product1);
        List<Product> founds = productRepository.findByCategory(product1.getCategory());

    }
}
