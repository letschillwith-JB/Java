package com.masai.Usecases;

import java.util.Scanner;

import com.masai.Dao.EmployeeDaoImpl;
import com.masai.Exceptions.EmployeeException;

public class GetEmployeeSalaryById {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter empId");
		
		EmployeeDaoImpl empimpl = new EmployeeDaoImpl();
		try {
			int salary = empimpl.getEmployeeSalaryById(sc.nextInt());
			if(salary == 0)System.out.println("No employee found...");
			else
				System.out.println("Employee salary is : "+salary);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
