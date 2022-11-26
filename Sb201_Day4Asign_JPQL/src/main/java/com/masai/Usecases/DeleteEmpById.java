package com.masai.Usecases;

import java.util.Scanner;

import com.masai.Dao.EmployeeDaoImpl;
import com.masai.Exception.EmployeeException;
import com.masai.model.Employee;

public class DeleteEmpById {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empId to delete Employee ");
		int empid = sc.nextInt();
		
		EmployeeDaoImpl empimpl = new EmployeeDaoImpl();
		try {
			Employee e =empimpl.deleteEmployeeById(empid);
			if(e!=null)System.out.println("Employee deleted successfully...");
			else System.out.println("Employee Not deleted");
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
