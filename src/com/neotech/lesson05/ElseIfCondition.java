package com.neotech.lesson05;

public class ElseIfCondition {

	public static void main(String[] args) {
		
		double d1 = 15;
		double d2 = 15;
		
		if (d1>d2) {
			System.out.println("Number "  + d1 + " is larger than " +d2);}
		
		if (d1 < d2) {
			System.out.println("Number "  + d1 + " is less than " +d2);}

		if (d1 == d2) {
			System.out.println("Number "  + d1 + " is equal than " +d2);}
		
		System.out.println("________________________");
		
		int a = 7;
		int b = 7;
		
		if (a == b)
		{
			System.out.println("Number " + a + " is equal to " + b);
		}
		else if (a < b) 
		{
			System.out.println("Number " + a + " is less than " + b);
		}
		else if (a > b) 
		{
			System.out.println("Number " + a + " is greater than " + b);
		}
		
	}

}
	
	
	
	
	
	
