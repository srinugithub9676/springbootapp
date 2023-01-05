package com.example.java.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.java.entity.Student;

@Component
public interface StudentService {

	Student saveStudentDetails(Student student);

	List<Student> findAllStudentDetails();

	Optional<Student> findIdStudentDetails(int studentId);

}
