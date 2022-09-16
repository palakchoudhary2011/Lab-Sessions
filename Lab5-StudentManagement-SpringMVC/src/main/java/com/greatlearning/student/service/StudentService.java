package com.greatlearning.student.service;

import java.util.List;

import com.greatlearning.student.entity.Student;

public interface StudentService {
	
	public List<Student> findAll();
	
	public void save(Student thestud);
	
	public Student getStudentById(int id);
	
	public void deletStudentById(int id);
	
}
