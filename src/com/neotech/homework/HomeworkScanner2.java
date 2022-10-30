package com.neotech.homework;

import java.util.Scanner;

public class HomeworkScanner2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter a number");
		int day = input.nextInt();
		
		if(day >= 1 && day <= 5)
		{
			System.out.println("It is a weekday");
		}
		else if (day >= 6 && day <= 7)
		{
			System.out.println("It is a weekend");
		}
		else
		{
			System.out.println("Invalid day");
		}
		
		// second option 
		
		if(day == 1 || day == 2 || day == 3 || day == 4 || day == 5)
		{
			System.out.println("It is a weekday");
		}
		else if (day == 6 || day == 7)
		{
			System.out.println("It is a weekend");
		}
		else
		{
			System.out.println("Invalid day");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
