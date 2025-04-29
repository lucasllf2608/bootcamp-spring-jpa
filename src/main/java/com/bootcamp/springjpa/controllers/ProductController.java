package com.bootcamp.springjpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.springjpa.Entities.Product;
import com.bootcamp.springjpa.services.ProductService;



@RestController
@RequestMapping(value="/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> listProducts = productService.findAll();
		return ResponseEntity.ok().body(listProducts);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Product> findByID(@PathVariable Long id){
		Product product = productService.findById(id);
		return ResponseEntity.ok().body(product);
	} 
	
}
