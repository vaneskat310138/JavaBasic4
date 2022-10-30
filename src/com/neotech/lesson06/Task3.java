package com.neotech.lesson06;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter first number");
		int firstnumber = input.nextInt();
		
		System.out.println("Please enter second number");
		int secondnumber = input.nextInt();
		
		if(firstnumber > secondnumber)
		{
			System.out.println("First number is larger");
		}
		else if(firstnumber == secondnumber)
		{
			System.out.println("Numbers are equal");
		}
		else 
			System.out.println("Second number is larger");
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
