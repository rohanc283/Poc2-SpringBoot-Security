package com.neosoft.Poc2.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.Poc2.Model.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
