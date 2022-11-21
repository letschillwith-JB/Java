package com.masai.usecase;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.model.Product;

public class SearchProduct {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product Id");
		int pId = sc.nextInt();
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
		EntityManager em = emf.createEntityManager();		
		
		Product p = em.find(Product.class, pId);
		
		if(p != null) System.out.println(p);
		else System.out.println("No product exist");
		
	}

}
