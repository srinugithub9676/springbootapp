package com.example.java.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.java.entity.Student;
import com.example.java.service.StudentService;



@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/test")
	public String test() {
		return "WELCOME TO SPRINGBOOT APPLICATION IT'S MY FIRST TIME WORKING ON JENKINS11 And Also Added from eclipse to firsttime ";
		
	}

	@PostMapping(value= "/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		Student student1=studentService.saveStudentDetails(student);
		return new ResponseEntity<>(student1,HttpStatus.CREATED);
	}
	@GetMapping(value= "/findAll")
	public ResponseEntity<Student> findAllStudent(){
		List<Student> allStudents=studentService.findAllStudentDetails();
		return new ResponseEntity(allStudents,HttpStatus.OK);
		
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@GetMapping(value= "/id/{studentId}")
	public ResponseEntity<Student> findbyId(@PathVariable("studentId") int studentId){
		Optional<Student> allStudents=studentService.findIdStudentDetails(studentId);
		return new ResponseEntity(allStudents,HttpStatus.OK);
		
	}

}
