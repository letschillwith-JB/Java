package com.masai.Usecases;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.Student;

public class GetStudent {
	
public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
		
		EntityManager em = emf.createEntityManager();
		
		Student s = em.find(Student.class, 1);
		
		if(s != null) {
			System.out.println(s);
		}else {
			System.out.println("Student does not exist");
		}
	}

}
