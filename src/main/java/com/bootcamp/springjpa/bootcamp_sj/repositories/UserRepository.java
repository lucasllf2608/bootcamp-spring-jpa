package com.bootcamp.springjpa.bootcamp_sj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.springjpa.bootcamp_sj.Entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
