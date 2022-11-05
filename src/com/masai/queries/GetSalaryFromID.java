package com.masai.queries;

import java.util.Scanner;

import com.masai.Dao.Employee3DaoImpl;

public class GetSalaryFromID {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter EmployeeId ");
		int eid = sc.nextInt();
		
		Employee3DaoImpl obj = new Employee3DaoImpl();
		int output = obj.getSalary(eid);
		
		if(output == -1)
			System.out.println("No Employee with ID "+eid);
		else
		System.out.println("Salary is :"+ output);
		
	}

}
