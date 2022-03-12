package com.springrest.springbootApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springbootApp.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	
	

}
