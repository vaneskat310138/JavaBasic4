package com.neotech.lesson21;

public class Animals {
	
	String color, size;
	int age;
	
	public void eat()
	{
		System.out.println("All animals eat");
	}
	
	public void sleep ()
	{
		System.out.println("All animals sleep");
	}
	public void displayInfo()
	{
		System.out.println("size " + size + " color " + color + " age " + age);
	}

}
