package com.masai.Usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.Dao.EmployeeDaoImpl;
import com.masai.Exceptions.EmployeeException;
import com.masai.models.Employee;

public class GetEmployeesByAddress {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Address");
		String add = sc.next();
		
		EmployeeDaoImpl empimpl = new EmployeeDaoImpl();
		try {
			List<Employee> list = empimpl.getEmployeesByAddress(add);
			if(list == null)
				System.out.println("Employee not found...");
			else {
				System.out.println(list);
			}
			
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
