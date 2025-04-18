package com.bootcamp.springjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.springjpa.Entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
