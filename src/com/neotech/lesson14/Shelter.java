package com.neotech.lesson14;

public class Shelter {

	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		
		d1.breed = "German Shepard";
		d1.color = "Black";
		d1.age = 20;
		d1.size = 'L';
		
		d1.eat();
		d1.run();
		d1.barks();
		
		Dog d2 = new Dog();
		
		d2.breed = "Golden Retriever";
		d2.color = "Brown";
		d2.age = 5;
		d2.size = 'L';
		
		d2.eat();
		d2.run();
		d2.barks();
		
		Dog d3 = new Dog();
		
		d3.breed = "St. Bernard";
		d3.color = "White";
		d3.age = 12;
		d3.size = 'M';
		
		d3.eat();
		d3.run();
		d3.barks();
		
	}
}
