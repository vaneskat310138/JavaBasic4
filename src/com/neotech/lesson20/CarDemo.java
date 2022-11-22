package com.neotech.lesson20;

public class CarDemo {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.make = "Toyota";
		c.model = "Camry";
		c.year = 2020;
		
		c.printDetails();
		
		//with parameters constructor
		Car c2 = new Car("BMW", "M5", 2021);
		c2.printDetails();
		
	}
}
