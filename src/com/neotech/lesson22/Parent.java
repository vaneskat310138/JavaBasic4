package com.neotech.lesson22;

public class Parent {

	String name = "Parent name";
	String lastName = "Parent lastName";
	
	void hello()
	{
		System.out.println("Printing from Parent!");
	}
	
}




class Child extends Parent
{
	String name = "child name";
	
	void display()
	{
		System.out.println(name);	
		System.out.println(this.name);
		System.out.println(super.name);
		System.out.println(lastName);
		System.out.println(this.lastName);
	}
	
	void hello()
	{
		System.out.println("Printing from the child class");
	}
	void sayHello()
	{
		display();
		hello();
		
	}
}