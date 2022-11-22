package com.neotech.lesson24;

public class FinalExample {
	
	//1. Create a class FinalExamples that has one final String variable 
	//with an initial value and one final method printVariable().
	//In the main method create an object of FinalExamples class 
	//and try to reassign a value to instance variable.
	//Create a sub class of FinalExamples named ChildClass and try to override 
	//the printVariable() method.

	final String str = "Happy Holidays";
	
	final void printVariable()
	{
		System.out.println("Hello " + str);
	}
	
	public static void main(String[] args) {
		
		FinalExample fe = new FinalExample();
		
		fe.printVariable();
	}
	
	class ChildClass extends FinalExample {
		
		//final void printVariable () {
		//can't override final methods
		//}	
		
	
	
}
		
	
}	
		
	
