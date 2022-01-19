package com.neosoft.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.Repo.ProjectRepository;
import com.neosoft.model.Project;


@Service
public class ProjectService {
	@Autowired
	private ProjectRepository projectRepository;
	
	public Project save(Project pro) {
		return projectRepository.save(pro);
	}
	
	public List<Project> getAllProjects() {
		return projectRepository.findAll();	
	}


}
