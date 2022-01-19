package com.neosoft.controller;

import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.Repo.StudentRepository;
import com.neosoft.SpringBoot.Exception.ResourceNotFoundException;
import com.neosoft.model.Project;
import com.neosoft.service.ProjectService;


@RestController
public class ProjectController {
	@Autowired
	private ProjectService projectService;
	@Autowired
	private StudentRepository studentRepository;
	@GetMapping("/allProjects")
	public List<Project> getAllProjects(){
		return projectService.getAllProjects();
	}
	
	@PostMapping("addProject/student/{stId}")
	public Project createComment(@PathVariable int stId, @Valid @RequestBody Project pro){
		return studentRepository.findById(stId).map(proj -> {
			pro.setStudent(proj);
			return projectService.save(pro);
		}).orElseThrow(() -> new ResourceNotFoundException("Student", "Student id", stId));
	}

}
