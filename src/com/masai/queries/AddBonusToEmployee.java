package com.masai.queries;

import java.util.Scanner;

import com.masai.Dao.Employee3DaoImpl;
public class AddBonusToEmployee {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter bonus amount");
		int bonus = sc.nextInt();
		
		Employee3DaoImpl obj = new Employee3DaoImpl();
		String ans = obj.giveBonusToEmployees(bonus);
		System.out.println(ans);
	}
}
