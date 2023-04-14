package com.masai.usecases;

import javax.persistence.EntityManager;

import com.masai.connection.ProvideConnection;
import com.masai.model.Department;
import com.masai.model.Employee;

public class Main {
	
	public static void main(String[] args) {
		
		Department d1 = new Department();
		
		
		Employee e1 = new Employee();
		e1.setAddress("Nagpur");
		e1.setDepartment(d1);
		e1.setName("e1");
		e1.setSalary(10000);
		
		Employee e2 = new Employee();
		e2.setAddress("Delhi");
		e2.setDepartment(d1);
		e2.setName("e2");
		e2.setSalary(20000);
		
		Employee e3 = new Employee();
		e3.setAddress("Bhopal");
		e3.setDepartment(d1);
		e3.setName("e3");
		e3.setSalary(30000);
		
		
		d1.getEmployee().add(e1);
		d1.getEmployee().add(e2);
		d1.getEmployee().add(e3);
		
		
		EntityManager em = ProvideConnection.getConnection();
		em.getTransaction().begin();
		em.persist(d1);
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		em.getTransaction().commit();
		System.out.println("All done....");
		
	}

}
