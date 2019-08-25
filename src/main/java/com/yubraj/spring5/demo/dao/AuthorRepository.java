package com.yubraj.spring5.demo.dao;

import com.yubraj.spring5.demo.blueprint.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
