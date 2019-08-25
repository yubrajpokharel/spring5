package com.yubraj.spring5.demo.services;


import com.yubraj.spring5.demo.blueprint.Product;
import com.yubraj.spring5.demo.dao.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }



    @Override
    public Optional<Product> getProduct(Integer id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> listProducts() {
       return productRepository.findAll();
    }

}
