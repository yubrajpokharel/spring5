package com.yubraj.spring5.demo.controller;


import com.yubraj.spring5.demo.blueprint.Product;
import com.yubraj.spring5.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping({"/"})
    public List<Product> getIndex() {

        return productService.listProducts();
    }
}
