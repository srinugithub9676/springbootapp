package com.example.java.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue
	private int studentId;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public Student(){
		
	}
	public Student(int studentId, String studentName, int age, double salparttimeSalary) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
		this.salparttimeSalary = salparttimeSalary;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", age=" + age
				+ ", salparttimeSalary=" + salparttimeSalary + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalparttimeSalary() {
		return salparttimeSalary;
	}
	public void setSalparttimeSalary(double salparttimeSalary) {
		this.salparttimeSalary = salparttimeSalary;
	}
	private String studentName;
	private int age;
	private double salparttimeSalary;
}
