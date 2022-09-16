package com.greatlearning.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.student.entity.Student;
import com.greatlearning.student.service.StudentService;

@Controller
public class HelloController {
	
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping("/")
	public String showMainPage(Model model) {
		List<Student> stud = studentService.findAll();
		model.addAttribute("Students", stud);
		System.out.println("Students"+stud);
		return "list-students";
	}
}
