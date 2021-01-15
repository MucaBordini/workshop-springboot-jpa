package com.estagiogubee.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estagiogubee.curso.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{

}
