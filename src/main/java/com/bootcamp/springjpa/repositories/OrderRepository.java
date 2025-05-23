package com.bootcamp.springjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.springjpa.Entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
