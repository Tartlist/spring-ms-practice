package com.example.productmicroservice.services;

import com.example.productmicroservice.model.Category;
import com.example.productmicroservice.model.Product;

import java.util.List;

public interface ProductService {
    public List<Product> listAllProducts();
    public Product getProduct(Long id);
    public Product createProduct(Product product);
    public Product updateProduct(Product product);
    public Product deleteProduct(Long id);
    public List<Product> findByCategory(Category category);
    public Product updateStock(Long id, Double quantity);
}
