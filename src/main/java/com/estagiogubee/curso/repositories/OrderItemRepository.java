package com.estagiogubee.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estagiogubee.curso.entities.OrderItem;

public interface OrderItemRepository  extends JpaRepository<OrderItem, Long>{

}
