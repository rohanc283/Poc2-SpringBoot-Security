package com.neosoft.Repo;

import java.util.Optional;



import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.model.Student;


public interface StudentRepository extends JpaRepository<Student, Integer> {
	 Optional<Student> findByFirstName(String fName);

}
