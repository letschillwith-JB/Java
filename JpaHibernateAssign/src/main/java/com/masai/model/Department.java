package com.masai.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer depId;
	
	private String name;
	private String location;
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "department")
	private Set<Employee> employee = new HashSet<Employee>();

}
