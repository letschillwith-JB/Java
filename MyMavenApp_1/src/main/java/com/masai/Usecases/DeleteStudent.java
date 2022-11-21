package com.masai.Usecases;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.Student;

public class DeleteStudent {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
		EntityManager em = emf.createEntityManager();
		
		Student s = em.find(Student.class, 3);
		
		if(s != null) {
			em.getTransaction().begin();
			
			em.remove(s);
			
			em.getTransaction().commit();
			
			System.out.println("Student Removed...");
		}
		else {
			System.out.println("Student does not exist");
		}
	}

}
