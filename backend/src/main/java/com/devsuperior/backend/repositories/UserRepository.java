package com.devsuperior.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.backend.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
}
