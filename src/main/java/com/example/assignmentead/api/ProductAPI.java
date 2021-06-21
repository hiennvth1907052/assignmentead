package com.example.assignmentead.api;

import com.example.assignmentead.entity.Product;
import com.example.assignmentead.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductAPI {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Product create(@RequestBody Product product){
        return productService.saveAll(product);
    }
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Product> productList(){
        return productService.getListProduct();
    }
}
