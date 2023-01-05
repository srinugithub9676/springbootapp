package com.example.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.java.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
