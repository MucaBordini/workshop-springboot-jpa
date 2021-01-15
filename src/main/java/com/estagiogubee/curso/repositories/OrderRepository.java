package com.estagiogubee.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estagiogubee.curso.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{

}
