package com.example.java.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.java.entity.Student;

@Component
public interface StudentService {

	Student saveStudentDetails(Student student);

	List<Student> findAllStudentDetails();

}
