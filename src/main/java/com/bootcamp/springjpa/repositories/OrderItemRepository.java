package com.bootcamp.springjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.springjpa.Entities.OrderItem;
import com.bootcamp.springjpa.Entities.pk.OrderItemPK;


@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
