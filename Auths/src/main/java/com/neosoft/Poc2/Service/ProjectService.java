package com.neosoft.Poc2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.Poc2.Model.Project;
import com.neosoft.Poc2.Repo.ProjectRepository;

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
