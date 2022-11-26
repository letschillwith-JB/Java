package com.masai.Usecases;

import java.util.Scanner;

import com.masai.Dao.EmployeeDaoImpl;
import com.masai.Exception.EmployeeException;
import com.masai.model.Employee;

public class UpdateEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empId to update...");
		int empId = sc.nextInt();
		System.out.println("Enter new name");
		String name = sc.next();
		System.out.println("Enter new address");
		String address = sc.next();
		System.out.println("Enter new salary");
		int salary = sc.nextInt();
		
		Employee e1 = new Employee();
		e1.setEmpId(empId);
		e1.setAddress(address);
		e1.setSalary(salary);
		
		EmployeeDaoImpl empimpl = new EmployeeDaoImpl();
		try {
			Employee e =empimpl.updateEmployee(e1);
			if(e==null)System.out.println("No emp exist with "+empId);
			else System.out.println("Emp updated....");
			
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
 	}
}
