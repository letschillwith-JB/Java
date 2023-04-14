package com.masai.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProvideConnection {
	
	public static EntityManager getConnection() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
		EntityManager em = emf.createEntityManager();
		return em;
	}

}
