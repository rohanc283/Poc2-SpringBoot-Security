package com.neosoft.controller;

import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.model.Student;
import com.neosoft.service.StudentService;


@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@GetMapping("/allStudents")
	public List<Student> getAllStudents(){
		return studentService.getAllstudents();
	}
	
	@GetMapping("/studentById/{id}")
	public Student getStudentById(@PathVariable int id){
		return studentService.getStudentById(id);
	}
	
	@PostMapping("/addStudent")
	public Student createPost(@Valid @RequestBody Student stu){
		return studentService.save(stu);
	}
	

}
