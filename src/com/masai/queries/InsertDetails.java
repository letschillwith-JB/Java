package com.masai.queries;

import java.util.Scanner;

import com.masai.Dao.Employee3Dao;
import com.masai.Dao.Employee3DaoImpl;
public class InsertDetails {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter EmployeeID");
		int eid = sc.nextInt();
		
		System.out.println("Enter Employee name");
		String ename = sc.next();
		
		System.out.println("Enter Employee address");
		String address = sc.next();
		
		System.out.println("Enter Employee salary");
		int salary = sc.nextInt();
		
		Employee3Dao obj1 = new Employee3DaoImpl();
		String output = obj1.insertEmployee3Details(eid, ename, address, salary);
		System.out.println(output);
		
	}

}
