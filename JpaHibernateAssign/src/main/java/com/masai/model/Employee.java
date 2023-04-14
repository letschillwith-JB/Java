package com.masai.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
	private String name;
	private String address;
	private int salary;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Department department;

}
