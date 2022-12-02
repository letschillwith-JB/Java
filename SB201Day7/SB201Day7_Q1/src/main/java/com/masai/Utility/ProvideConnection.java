package com.masai.Utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProvideConnection {

	
	public static EntityManager getConnection() {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("abc");
		 
		 return emf.createEntityManager();
		
	}
}
