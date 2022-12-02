package com.masai.Usecases;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;


import com.masai.Utility.ProvideConnection;
import com.masai.models.Collage;
import com.masai.models.Student;

public class GetAllStudentsByCollageId {
	
	public static void main(String[] args) {
		EntityManager em = ProvideConnection.getConnection();
//		String jpql = "select set from Collage where collageId = 1";
//		
//		Query q1 = em.createQuery(jpql); 	
//		
//		q1.setParameter("id", 1);
		
		Collage c = em.find(Collage.class, 2);
		
		List<Student> al = c.getAl();
		
		if(c==null)System.out.println("No collage exist ...");
		else 
		{
			al.forEach(I -> {
				System.out.println(I.getEmail()+" "+I.getMobile()+" "+I.getStudentName());
			});
		}
		
	}

}
