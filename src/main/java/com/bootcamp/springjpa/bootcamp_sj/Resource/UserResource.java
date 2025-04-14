package com.bootcamp.springjpa.bootcamp_sj.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.springjpa.bootcamp_sj.Entities.User;



@RestController
@RequestMapping(value="/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		
		User u = new User(1L, "Maria", "maria@mail.com", "85999115522", "123456");
		return ResponseEntity.ok().body(u);
	
	}
	
}
