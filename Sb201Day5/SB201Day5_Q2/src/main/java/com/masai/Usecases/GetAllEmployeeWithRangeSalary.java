package com.masai.Usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.Dao.EmployeeDaoImpl;
import com.masai.Exceptions.EmployeeException;
import com.masai.models.Employee;

public class GetAllEmployeeWithRangeSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start salary ");
		int startSalary = sc.nextInt();
		System.out.println("Enter End salary");
		int endSalary = sc.nextInt();
		
		EmployeeDaoImpl empimpl = new EmployeeDaoImpl();
		try {
			List<Employee> list = empimpl.getAllEmployeeWithRangeSalary(startSalary, endSalary);
			if(list == null)System.out.println("No emp found...");
			else 
			list.forEach(I -> {
				System.out.println(I);
			});
			
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
