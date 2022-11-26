package com.masai.Usecases;

import java.util.Scanner;

import com.masai.Dao.EmployeeDaoImpl;
import com.masai.Exception.EmployeeException;
import com.masai.model.Employee;

public class GetEmployee {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empId");
		int empId = sc.nextInt();
		
		EmployeeDaoImpl empl = new EmployeeDaoImpl();
		try {
			Employee em = empl.getEmployeeById(empId);
			System.out.println(em);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
