package com.bootcamp.springjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.springjpa.Entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}