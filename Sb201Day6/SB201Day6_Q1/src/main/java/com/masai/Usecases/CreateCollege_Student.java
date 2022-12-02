package com.masai.Usecases;

import javax.persistence.EntityManager;

import com.masai.Utility.ProvideConnection;
import com.masai.models.Collage;
import com.masai.models.Student;

public class CreateCollege_Student {
	
	public static void main(String[] args) {
		EntityManager em = ProvideConnection.getConnection();
		em.getTransaction().begin();
		
		Collage c1 = new Collage();
		Collage c2 = new Collage();
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		
		
		
		
		c1.setCollageName("Farzi collage");
		c1.setCollageAddress("Bhopal");
		c1.getAl().add(s1);
		c1.getAl().add(s3);
		
		c2.setCollageName("Lallu collage");
		c2.setCollageAddress("Delhi");
		c2.getAl().add(s2);
		c2.getAl().add(s4);
		
		s1.setStudentName("Chaman");
		s1.setMobile("12345");
		s1.setEmail("Chaman@gmail");
		s1.setCollage(c1);
		
		
		s2.setStudentName("Khaman");
		s2.setMobile("123322");
		s2.setEmail("Khaman@gmail");
		s2.setCollage(c2);
		
		
		s3.setStudentName("Rhaman");
		s3.setMobile("177885");
		s3.setEmail("Rhaman@gmail");
		s3.setCollage(c1);
		
		
		s4.setStudentName("Bhaman");
		s4.setMobile("1231111");
		s4.setEmail("Bhaman@gmail");
		s4.setCollage(c2);
		
		
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(s4);
		
		em.persist(c1);
		em.persist(c2);
		
		
		em.getTransaction().commit();
		em.close();
		System.out.println("Done....");
	}

}
