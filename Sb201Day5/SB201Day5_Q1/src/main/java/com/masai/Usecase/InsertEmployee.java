package com.masai.Usecase;

import javax.persistence.EntityManager;

import com.masai.models.Address;
import com.masai.models.Employee;
import com.masai.utility.ProvideConnection;

public class InsertEmployee {
	
	public static void main(String[] args) {
		EntityManager em = ProvideConnection.getConnection();
		
		Employee e1 = new Employee();
		e1.setGender("Male");
		e1.setName("Rakesh");
		e1.setSalary("10000");
		e1.getEmpAddress().add(new Address("MH","Mumbai","12345","Office"));
		e1.getEmpAddress().add(new Address("MH","Pune","22312","Home"));
		
		Employee e2 = new Employee();
		e2.setGender("Female");
		e2.setName("Rishika");
		e2.setSalary("12000");
		e2.getEmpAddress().add(new Address("Himachal Pradesh","Manali","12321","Home"));
		e2.getEmpAddress().add(new Address("Karnataka","Bangalore","223311","Office"));

		Employee e3 = new Employee();
		e3.setGender("Female");
		e3.setName("Muskan");
		e3.setSalary("15000");
		e3.getEmpAddress().add(new Address("Madhya Pradesh","Indore","454321","Office"));
		e3.getEmpAddress().add(new Address("Madhya Pradesh","Bhopal","34355","Home"));
		
		
		Employee e4 = new Employee();
		e4.setGender("Male");
		e4.setName("Rohit");
		e4.setSalary("11000");
		e4.getEmpAddress().add(new Address("Assam","Guwahati","998877","Home"));
		e4.getEmpAddress().add(new Address("Punjab","Amritsar","223311","Office"));
		
		
		em.getTransaction().begin();
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		em.persist(e4);
		em.getTransaction().commit();
		em.close();
		
		System.out.println("Employee Inserted ....");
	}

}
