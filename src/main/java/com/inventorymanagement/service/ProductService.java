package com.inventorymanagement.service;

import com.inventorymanagement.model.Product;
import com.inventorymanagement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public void updateProduct(Product product) {
        productRepository.save(product);
    }

    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }

    public Product getProductById(int id) {
        return productRepository.findById(id).orElse(null);
    }
}
