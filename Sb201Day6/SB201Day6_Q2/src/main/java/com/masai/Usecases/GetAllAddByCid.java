package com.masai.Usecases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.Utility.ProvideConnection;
import com.masai.models.Address;
import com.masai.models.Customer;

public class GetAllAddByCid {

	public static void main(String[] args) {
		EntityManager em = ProvideConnection.getConnection();
		String jpql = "select address from Customer where cid = :cid";
		
		Query q1 = em.createQuery(jpql);
		
		q1.setParameter("cid", 1);
		
		List<Customer> list = q1.getResultList();			
		
		if(list == null) 
			System.out.println("No user exist with this cid...");
		else {
			list.forEach(I -> {
				System.out.println(I);
			});
		}
		
		
		
	}
}
