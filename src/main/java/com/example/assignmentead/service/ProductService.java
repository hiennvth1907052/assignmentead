package com.example.assignmentead.service;

import com.example.assignmentead.entity.Product;
import com.example.assignmentead.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product saveAll(Product product){
        return productRepository.save(product);
    }

    public List<Product> getListProduct(){
        return productRepository.findAll();
    }
}
