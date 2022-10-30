package com.neotech.lesson06;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name:");
		
		String name = input.next();
		System.out.println("Nice to meet you: " + name);
		
		System.out.println("Please enter your age");
		int age = input.nextInt();
		System.out.println("Your age is:" + age);
		
		System.out.println("Please enter your weight");
		double weight = input.nextDouble();
		System.out.println("Your weight is: " + weight);
		
		System.out.println("Do you think it will rain today");
		boolean rain = input.nextBoolean();
		if(rain)
		{
			System.out.println("Bring your umbrella");
		}
		else
		System.out.println("Enjoy de weather");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
