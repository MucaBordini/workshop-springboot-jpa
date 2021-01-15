package com.estagiogubee.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estagiogubee.curso.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
