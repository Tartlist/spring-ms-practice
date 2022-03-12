package com.example.productmicroservice.repositories;

import com.example.productmicroservice.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
