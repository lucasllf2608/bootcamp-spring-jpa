package com.bootcamp.springjpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.springjpa.Entities.Category;
import com.bootcamp.springjpa.Entities.User;
import com.bootcamp.springjpa.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findAll(){
		return categoryRepository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> user = categoryRepository.findById(id);
		return user.get();
	}
	
}
