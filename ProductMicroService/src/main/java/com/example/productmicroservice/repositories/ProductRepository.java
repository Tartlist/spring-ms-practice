package com.example.productmicroservice.repositories;

import com.example.productmicroservice.model.Category;
import com.example.productmicroservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    public List<Product> findByCategory(Category category);
}
