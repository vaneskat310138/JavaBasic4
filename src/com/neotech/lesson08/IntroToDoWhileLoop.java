package com.neotech.lesson08;

public class IntroToDoWhileLoop {

	public static void main(String[] args) {
		
		int num1 = 1;
		
		do
		{
			System.out.println(num1 + " ");
			
			num1++;	
		}while(num1 >= 15);
		
		
		System.out.println("______________________________________");
			
		boolean workDay = true;
		int day = 1;
		
		while(workDay)
		{
			if (day<6)
			{
			System.out.println("I need a day off");
			}
			else
			{
			System.out.println("I dont need a day off anymore");
			workDay = false;
			}
		
		day++;
	}
	
	}
}
