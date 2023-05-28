package com.masai;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter the number of passengers");
		int numberOfPassengers = sc.nextInt();
		
		System.out.println("Enter the number of Kms");
		int numberOfKms = sc.nextInt();
		
		OLA obj1 = new OLA();
		Car car = obj1.bookCar(numberOfPassengers, numberOfKms);
		
		int bill = obj1.calculateBill(car);
		System.out.println("Car Booked Successfully Estd bill amt is: "+bill);
		}
		catch(InputMismatchException e) {
			System.out.println("Enter the valid data");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}