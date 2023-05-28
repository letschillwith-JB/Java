package com.masai;

public class OLA {
	
	public Car bookCar(int numberOfPassengers, int numberOfKms) throws Exception {
		if(numberOfPassengers <= 3) {
			return new HatchBack(numberOfPassengers, numberOfKms);
		} 
		else if (numberOfPassengers<=5){
			return new Sedan(numberOfPassengers, numberOfKms);
		}
		else throw new Exception("Cannot book a car passenger limit is 5 persons");
	}
	
	public int calculateBill(Car car) {
		int farePerKm ;
		if(car instanceof Sedan)farePerKm = 20;
		else farePerKm = 15;
		int totalFare = car.getNumberOfKms() * farePerKm;
		return totalFare;
	}

}
