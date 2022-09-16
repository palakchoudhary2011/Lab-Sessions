package com.greatlearning.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatlearning.student.entity.Student;
import com.greatlearning.student.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/list")
	public String listStudent( Model model) {
		List<Student> stud = studentService.findAll();
		model.addAttribute("Students", stud);
		System.out.println("Students"+stud);
		return "list-students";
	}
	
	@RequestMapping("/updateStudent")
	public String updateStudent(@RequestParam("id") int id, Model model) {
		Student stud = new Student();
		stud = studentService.getStudentById(id);
		System.out.println("Students"+stud);
		model.addAttribute("Students", stud);
		return "add-student";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent( Model model) {
		Student stud = new Student();
		model.addAttribute("Students", stud);
		return "add-student";
	}
	
	@PostMapping("/save")
	public String saveStudent(@RequestParam("id") int id, @RequestParam("name") String name,@RequestParam("department") String department, @RequestParam("country") String country) {
		Student stud;
		System.out.println(id+ name+ department+country);
		System.out.println("save ");
		if(id != 0) {
			stud = studentService.getStudentById(id);
			stud.setName(name);
			stud.setCountry(country);
			stud.setDepartment(department);
		}else {
			stud = new Student(name, department, country);
		}
		studentService.save(stud);
		
		return "redirect:/students/list";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("id") int id) {
		studentService.deletStudentById(id);
		return "redirect:/students/list";
	}
	

	
	
	
}
