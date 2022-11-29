package com.masai.Dao;

import java.util.List;

import com.masai.Exceptions.EmployeeException;
import com.masai.models.Employee;

public interface EmployeeDao {

	public List<Employee> getAllEmployees() throws EmployeeException;
	public List<Employee> getEmployeesByAddress(String address) throws EmployeeException;
	public List<Employee> getAllEmployeeWithRangeSalary(int startSalary,int endSalary) throws EmployeeException;
	public Object[] getEmployeeNameAndSalary(int empId)throws EmployeeException;
	public int getEmployeeSalaryById(int empId)throws EmployeeException;
			
	
}

