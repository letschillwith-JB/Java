package com.masai.Usecases;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.Student;

public class InsertStudent {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
		
		EntityManager em  = emf.createEntityManager();
		
		Student s = new Student(2, "Manmohan", 85);
		
		em.getTransaction().begin();
		
		em.persist(s);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Oject added successfully");
		
	}

}
