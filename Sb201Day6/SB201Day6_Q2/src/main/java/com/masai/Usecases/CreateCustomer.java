package com.masai.Usecases;

import javax.persistence.EntityManager;

import com.masai.Utility.ProvideConnection;
import com.masai.models.Address;
import com.masai.models.Customer;

public class CreateCustomer {
	
	public static void main(String[] args) {
		EntityManager em = ProvideConnection.getConnection();
		
		em.getTransaction().begin();
		
		Customer c1 = new Customer();
		c1.setName("C1");
		c1.setEmail("C1@gmail.com");
		c1.setMobileNumber("9988776665");
		c1.getAddress().add(new Address("MP","Bhopal","12345","Home"));
		c1.getAddress().add(new Address("MP","Indore","54321","Office"));
		
		
		Customer c2 = new Customer();
		c2.setName("C2");
		c2.setEmail("C2@gmail.com");
		c2.setMobileNumber("9988744555");
		c2.getAddress().add(new Address("MH","Pune","12345","Home"));
		c2.getAddress().add(new Address("MH","Mumbai","54321","Office"));
		
		em.persist(c1);
		em.persist(c2);
		
		em.getTransaction().commit();
		em.close();
		
		System.out.println("Done....");
	}

}
