package com.springboot.studentController;

import java.util.Optional;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Student;
import com.springboot.stdservice.StdService;
import com.springboot.studentRepository.StudentRepository;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class StudentController {
	
	@Autowired
	private StdService studentService;
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping(value="/")
	public String home() {
		return "hello world";
		
		
	}
	
	@PostMapping(value ="/save")
	public  Student CreateStud(@RequestBody Student  stud) {
		
		
		return studentService.save(stud);
		
		}
	
	
		@GetMapping("/studentall")
		public java.util.List<Student> getAllEmployees() {
			
			return studentRepository.findAll();
		}
		
	
		@GetMapping(value="/listStudent/{id}")
		public Optional<Student> getListStudent(@PathVariable (value="id") Long studentId) {
			
			
		
			return studentService.findbyId(studentId);
			
		}
		@PutMapping(value="/Studentupdate/{id}")
		public Student updateStudent(@PathVariable (value="id") Long studentId ,@Validated @RequestBody Student std1 ) {
			
			Student sd = studentRepository.getOne(studentId);
			 sd.setFirstName(std1.getFirstName());
			sd.setLastName(std1.getLastName());
			sd.setSchoolCode(std1.getSchoolCode());
			sd.setDistrictCode(std1.getDistrictCode());
			
				return studentService.save(sd);
			
			
		}
		
		
		
	}
	
	


