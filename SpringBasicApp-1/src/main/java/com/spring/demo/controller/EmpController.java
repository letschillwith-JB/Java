package com.spring.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.model.Employee;
import com.spring.demo.service.EmpService;


@RestController
public class EmpController {
	
	@Autowired
	private EmpService empService; 
	
	@PostMapping("employee")
	public ResponseEntity<Employee> regesterEmployee(@org.springframework.web.bind.annotation.RequestBody Employee employee) throws Exception{
		Employee e1 = empService.saveEmployee(employee);
		
		return new ResponseEntity<>(e1,HttpStatus.CREATED);
	}
	

	@GetMapping("employee/{id}")
	public ResponseEntity<Employee> getEmpById(@PathVariable Integer id) throws Exception{
		Employee e1 = empService.getEmployeeById(id);
		
		return new ResponseEntity<Employee>(e1, HttpStatus.FOUND);
	}
	
	@GetMapping("employees")
	public ResponseEntity <List<Employee>> getAllEmp() {
		List<Employee> e1 = empService.getAllEmployees();
		
		return new ResponseEntity<>(e1, HttpStatus.FOUND);
	}
}
