package com.neosoft.Poc2.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stId;

	@NotNull
	@Size(max = 100)
	private String firstName;


	@NotNull
	@Size(max = 250)
	private String lastname;
	
	@NotNull
	private Long mobile;

	@NotNull
	private String email;
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "project")
//	private List<Project> projects;
}
