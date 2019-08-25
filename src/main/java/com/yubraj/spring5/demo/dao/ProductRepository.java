package com.yubraj.spring5.demo.dao;


import com.yubraj.spring5.demo.blueprint.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
