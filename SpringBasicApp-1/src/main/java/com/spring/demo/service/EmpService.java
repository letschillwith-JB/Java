package com.spring.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.demo.model.Employee;

@Service
public interface EmpService {
	
	public Employee saveEmployee(Employee employee)throws Exception;
	public Employee getEmployeeById(Integer id) throws Exception;
	public List<Employee> getAllEmployees();
	public Employee deleteEmployeeById(Integer id) throws Exception;
	
	public String getAddressOfEmployee(Integer empId);
	public String giveBonusToEmployee(Integer empId, Integer bonus);
	public String[] getNameAndAddress(Integer empId);

}
