package com.masai.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.models.Employee;
import com.masai.models.EmployeeDTO;
import com.masai.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

 @Autowired
 private EmployeeService employeeService;

 @Autowired
 private ModelMapper modelMapper;

 @PostMapping
 public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody EmployeeDTO employeeDTO) {
     Employee employee = convertToEntity(employeeDTO);
     Employee createdEmployee = employeeService.createEmployee(employee);
     EmployeeDTO createdEmployeeDTO = convertToDTO(createdEmployee);
     return new ResponseEntity<>(createdEmployeeDTO, HttpStatus.CREATED);
 }

 @GetMapping("/{id}")
 public ResponseEntity<EmployeeDTO> getEmployee(@PathVariable Integer id) {
     Employee employee = employeeService.getEmployee(id);
     EmployeeDTO employeeDTO = convertToDTO(employee);
     return new ResponseEntity<>(employeeDTO, HttpStatus.OK);
 }

 @PutMapping("/{id}")
 public ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable Integer id, @RequestBody EmployeeDTO employeeDTO) {
     Employee employee = convertToEntity(employeeDTO);
     Employee updatedEmployee = employeeService.updateEmployee(id, employee);
     EmployeeDTO updatedEmployeeDTO = convertToDTO(updatedEmployee);
     return new ResponseEntity<>(updatedEmployeeDTO, HttpStatus.OK);
 }

 @DeleteMapping("/{id}")
 public ResponseEntity<Void> deleteEmployee(@PathVariable Integer id) {
     employeeService.deleteEmployee(id);
     return new ResponseEntity<>(HttpStatus.NO_CONTENT);
 }

 private EmployeeDTO convertToDTO(Employee employee) {
     return modelMapper.map(employee, EmployeeDTO.class);
 }

 private Employee convertToEntity(EmployeeDTO employeeDTO) {
     return modelMapper.map(employeeDTO, Employee.class);
 }
}

