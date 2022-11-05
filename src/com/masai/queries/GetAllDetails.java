package com.masai.queries;

import java.util.ArrayList;

import com.masai.Dao.Employee3Dao;
import com.masai.Dao.Employee3DaoImpl;

public class GetAllDetails {
	
	public static void main(String[] args) {
		Employee3Dao obj = new Employee3DaoImpl();
		ArrayList l1 =  obj.getAllEmployee3Details();
		
		l1.forEach(s -> System.out.println(s));
	}
}
