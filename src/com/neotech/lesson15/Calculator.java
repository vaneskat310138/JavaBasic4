package com.neotech.lesson15;

public class Calculator {

	//we want to add two numbers
		void add(int a, int b)
		{
			int sum = a + b;
			System.out.println(sum);
		}
		
		//we want to multiply two numbers
		void multiply(int a, int b)
		{
			System.out.println(a*b);
		}
		
		
		//divide two numbers
		void divide(double a, double b)
		{
			
			System.out.println("The division of " + a + " by " + b + " is " + (a/b));
		}
}
