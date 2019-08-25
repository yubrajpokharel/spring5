package com.yubraj.spring5.demo.dao;


import com.yubraj.spring5.demo.blueprint.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 5/6/16.
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
}
