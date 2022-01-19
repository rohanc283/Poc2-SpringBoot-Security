package com.neosoft.Poc2.Service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.neosoft.Poc2.Model.Student;
import com.neosoft.Poc2.Repo.StudentRepository;


@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAllstudents() {
		return studentRepository.findAll();	
	}
	
	public Student save(Student stu) {
		return studentRepository.save(stu);
	}
	
	public Student getStudentById(int id){
		return studentRepository.findById(id).get();
	}
}
