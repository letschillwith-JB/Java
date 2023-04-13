package com.spring.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.model.Employee;
import com.spring.demo.repository.EmpRepo;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	private EmpRepo empRepo;
	
	@Override
	public Employee saveEmployee(Employee employee) throws Exception {
		if(empRepo.findById(employee.getEmpId()).isEmpty()) {
			return empRepo.save(employee);
		}
		throw new Exception("Employee already regestered");
	}

	@Override
	public Employee getEmployeeById(Integer id) throws Exception {
		if(empRepo.findById(id).isPresent()) {
			return empRepo.findById(id).get();
		}
		throw new Exception("No employee is registered with this id...");
	}

	@Override
	public List<Employee> getAllEmployees() {
		return empRepo.findAll();
	}

	@Override
	public Employee deleteEmployeeById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
