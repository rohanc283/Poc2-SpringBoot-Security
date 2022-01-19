package com.neosoft.Poc2.Repo;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.Poc2.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	 Optional<Student> findByFirstName(String fName);

}
