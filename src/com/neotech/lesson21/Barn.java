package com.neotech.lesson21;

public class Barn {
	
	public static void main(String[] args) {
		
	Animals a = new Animals();
	a.size = "Big";
	a.color = "Brown";
	a.age = 5;
	
	a.sleep();
	a.eat();
	a.displayInfo();
	
	System.out.println("------------------");
	
	Dog d = new Dog();
	d.size = "Medium";
	d.age = 2;
	d.color = "white";
	d.breed = "Husky";
	
	d.sleep();
	d.eat();
	d.displayInfo();
	d.bark();
	
	System.out.println("------------------");
	
	Cat c = new Cat();
	c.size = "Small";
	c.color = "Gray";
	c.age = 1;
	
	c.sleep();
	c.eat();
	c.displayInfo();
	c.meow();
	
	
	
	
	}
}
