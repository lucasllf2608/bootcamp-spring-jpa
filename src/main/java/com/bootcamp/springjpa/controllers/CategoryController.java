package com.bootcamp.springjpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.springjpa.Entities.Category;
import com.bootcamp.springjpa.Entities.User;
import com.bootcamp.springjpa.services.CategoryService;



@RestController
@RequestMapping(value="/category")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;

	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> listCategories = categoryService.findAll();
		return ResponseEntity.ok().body(listCategories);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Category> findByID(@PathVariable Long id){
		Category category = categoryService.findById(id);
		return ResponseEntity.ok().body(category);
	} 
	
}
