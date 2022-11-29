package com.masai.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String name;
	private String gender;
	private String salary;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@Embedded
	@JoinTable(name="empaddress",joinColumns=@JoinColumn(name="emp_id"))
	private Set<Address> empAddress = new HashSet<>();

	public Employee(int empId, String name, String gender, String salary, Set<Address> empAddress) {
		super();
		this.empId = empId;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.empAddress = empAddress;
	}

	public Employee() {
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Set<Address> getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(Set<Address> empAddress) {
		this.empAddress = empAddress;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", gender=" + gender + ", salary=" + salary
				+ ", empAddress=" + empAddress + "]";
	}

}
