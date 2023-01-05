package com.example.java.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.java.entity.Student;
import com.example.java.repository.StudentRepository;
import com.example.java.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudentDetails(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student); 
	}

	@Override
	public List<Student> findAllStudentDetails() {
		// TODO Auto-generated method stub
		List<Student> list=studentRepository.findAll();
		return list;
	}

	@Override
	public Optional<Student> findIdStudentDetails(int studentId) {
		Optional<Student> student=studentRepository.findById(studentId);
		
		return student;
	}

}
