package com.springrest.springbootApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springbootApp.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
