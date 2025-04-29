package com.bootcamp.springjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.springjpa.Entities.Category;
import com.bootcamp.springjpa.Entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}