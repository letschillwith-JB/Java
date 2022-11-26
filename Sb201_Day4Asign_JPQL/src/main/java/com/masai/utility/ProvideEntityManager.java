package com.masai.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProvideEntityManager {
	
	static EntityManagerFactory emf;
	
	static {
		emf = Persistence.createEntityManagerFactory("employeeUnit");
	}
	
	public static EntityManager getEntityManager() {
		
		EntityManager em = emf.createEntityManager();
		return em;
	}

}
