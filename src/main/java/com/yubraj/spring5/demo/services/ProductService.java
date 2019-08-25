package com.yubraj.spring5.demo.services;


import com.yubraj.spring5.demo.blueprint.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Optional<Product> getProduct(Integer id);

    List<Product> listProducts();
}
