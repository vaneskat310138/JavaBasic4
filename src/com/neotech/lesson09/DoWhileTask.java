package com.neotech.lesson09;

import java.util.Scanner;

public class DoWhileTask {

	public static void main(String[] args) {
		
		// While loop 
		
		int luckyNumber = 5;
		Scanner scan = new Scanner(System.in);
		
		int number;
		
		System.out.println("Guess my number: ");
		number = scan.nextInt();
		
		while(number != luckyNumber)
		{
			System.out.println("Guess my number: ");
			number = scan.nextInt();
		}
			
		System.out.println("You are a winner");
		
		
		System.out.println("_________________________________________");
		
		
		
		//DOWHILE 
		
		do 
		{
			System.out.println("Guess my number");
			number = scan.nextInt();
		}
		while (number != luckyNumber);
		
		System.out.println("You are a winner");
		
	}
}
