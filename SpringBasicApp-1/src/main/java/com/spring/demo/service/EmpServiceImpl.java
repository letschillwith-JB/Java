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
		if(empRepo.findById(id).isPresent()) {
			Employee e1 = empRepo.findById(id).get();
			empRepo.delete(e1);
			return e1;
		}
		throw new Exception("No employee exist with ID");
	}

	@Override
	public String getAddressOfEmployee(Integer empId) {
		if(empRepo.findById(empId).isPresent()) {
			Employee e1 = empRepo.findById(empId).get();
			return e1.getAddress();
		}
		return "No employee found with this id";
	}

	@Override
	public String giveBonusToEmployee(Integer id, Integer bonus) {
		
		if(empRepo.findById(id).isPresent()) {
			Employee e1 = empRepo.findById(id).get();
			e1.setSalary(e1.getSalary()+bonus);
			empRepo.save(e1);
			return "Bonus Added successfully...";
		}
		return "No employee found with this id";
	}

	@Override
	public String[] getNameAndAddress(Integer id) {
		String[] s = new String[2];
		if(empRepo.findById(id).isPresent()) {
			Employee e1 = empRepo.findById(id).get();
			s[0] = e1.getName();
			s[1] = e1.getAddress();	
		}
		return s;
	}

}
