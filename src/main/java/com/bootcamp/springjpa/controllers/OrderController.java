package com.bootcamp.springjpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.springjpa.Entities.Order;
import com.bootcamp.springjpa.services.OrderService;

@RestController
@RequestMapping(value ="/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> orders = orderService.findAll();
		return ResponseEntity.ok().body(orders);
	} 
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order order = orderService.findById(id);
		return ResponseEntity.ok().body(order);
	}
	
	
}
