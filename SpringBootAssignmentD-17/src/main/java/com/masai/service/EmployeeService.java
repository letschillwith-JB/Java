package com.masai.service;

import com.masai.models.Employee;

public interface EmployeeService {
	public Employee createEmployee(Employee employee) ;
	
	public Employee getEmployee(Integer id);
	
	public Employee updateEmployee(Integer id, Employee employee);
	
	public void deleteEmployee(Integer id);
}
