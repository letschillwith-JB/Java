package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.models.Address;
import com.masai.models.Employee;
import com.masai.repository.AddressRepo;
import com.masai.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

 @Autowired
 private EmployeeRepo employeeRepository;

 @Autowired
 private AddressRepo addressRepository;

 @Override
 public Employee createEmployee(Employee employee) {
     List<Address> address = employee.getAddresses();
     addressRepository.saveAll(address);//here we are using saveAll method
     return employeeRepository.save(employee);
 }

 @Override
 public Employee getEmployee(Integer id) {
     return employeeRepository.findById(id).orElse(null);
 }

 @Override
 public Employee updateEmployee(Integer id, Employee employee) {
     Employee existingEmployee = employeeRepository.findById(id).orElse(null);
     if (existingEmployee != null) {
         existingEmployee.setFirstName(employee.getFirstName());
         existingEmployee.setLastName(employee.getLastName());
         existingEmployee.setCellPhone(employee.getCellPhone());
         existingEmployee.setAddresses(employee.getAddresses());
         return employeeRepository.save(existingEmployee);
     } else {
         return null;
     }
 }

 @Override
 public void deleteEmployee(Integer id) {
     employeeRepository.deleteById(id);
 }
}

