package com.springboot.stdservice;

import java.util.Optional;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Student;
import com.springboot.studentRepository.StudentRepository;

@Service
public class StdService {
	
	
	@Autowired
	public StudentRepository studentRepository;
	
	
	public Student save(Student stud) {
		
		
		return studentRepository.save(stud);
	
		
	}


	public Optional<Student> findbyId(Long studentId) {
		
		
			return studentRepository.findById(studentId);
			
		
	}


	public Student updatestu(Long studentId) {
		
		return  studentRepository.save(studentId);
	}
	
	
	
	
	
	

}
