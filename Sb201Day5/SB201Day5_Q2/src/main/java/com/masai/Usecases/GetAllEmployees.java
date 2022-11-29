package com.masai.Usecases;

import java.util.List;

import com.masai.Dao.EmployeeDaoImpl;
import com.masai.Exceptions.EmployeeException;
import com.masai.models.Employee;

public class GetAllEmployees {
	
	public static void main(String[] args) {
		EmployeeDaoImpl empimpl = new EmployeeDaoImpl();
		try {
			List<Employee> list = empimpl.getAllEmployees();
			if(list == null)
				System.out.println("No employee found ...");
			else {
				list.forEach(I->{
					System.out.println(I);
				});
			}
				
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
