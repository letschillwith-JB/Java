package com.masai.Usecases;

import javax.persistence.EntityManager;

import com.masai.Utility.ProvideConnection;
import com.masai.models.Email;
import com.masai.models.User;

public class CreateUser {

public static void main(String[] args) {
	EntityManager em = ProvideConnection.getConnection();
	User u1 = new User();
	u1.setName("User1");
	u1.setEmail(new Email("User1@mail"));
	
	User u2 = new User();
	u2.setName("User2");
	u2.setEmail(new Email("User2@mail"));
	
	em.getTransaction().begin();
	em.persist(u1);
	em.persist(u2);
	em.getTransaction().commit();
	System.out.println("done...");
}

}
