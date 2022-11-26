package com.masai.Usecases;

import java.util.Scanner;

import com.masai.Dao.EmployeeDaoImpl;
import com.masai.Exception.EmployeeException;
import com.masai.model.Employee;

public class RegisterEmployee {
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name of employee");
		String name = sc.next();
		
		System.out.println("Enter Address of emp");
		String address = sc.next();
		
		System.out.println("Enter Salary of emp");
		int salary = sc.nextInt();
		
		EmployeeDaoImpl empimpl = new EmployeeDaoImpl();
		emp.setName(name);
		emp.setAddress(address);
		emp.setSalary(salary);
		try {
			Employee emp2 = empimpl.registerEmployee(emp);
			if(emp2 != null)System.out.println("Employee registered successfully");
			else System.out.println("Employee not regestered...");
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
