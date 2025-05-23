package com.bootcamp.springjpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.bootcamp.springjpa.Entities.User;
import com.bootcamp.springjpa.repositories.UserRepository;
import com.bootcamp.springjpa.services.excepetion.DataBaseException;
import com.bootcamp.springjpa.services.excepetion.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> user = userRepository.findById(id);
		return user.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public User insert(User obj) {
		return userRepository.save(obj);
	}
	
	public void delete(Long id) {
		try {
			
			if(!userRepository.existsById(id)) {
				throw new ResourceNotFoundException(id);	
			} else {
				userRepository.deleteById(id);
				userRepository.flush();	
			}
			
		} catch (DataIntegrityViolationException e) {
			throw new DataBaseException(e.getMessage());
		}
	}
	
	public User update(Long id, User obj) {		
		try {

			if(!userRepository.existsById(id)) {
				throw new ResourceNotFoundException(id);	
			} else {
				User entity = userRepository.getReferenceById(id);
				updateData(entity, obj);
				userRepository.flush();	
				return userRepository.save(entity);
			}
			
		} catch (DataIntegrityViolationException e ) {
			throw new DataBaseException(e.getMessage());
		}
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
	
}
