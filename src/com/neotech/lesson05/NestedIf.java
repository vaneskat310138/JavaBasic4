package com.neotech.lesson05;

public class NestedIf {
	
	public static void main(String[] args) {
		
		boolean isMorning = true;
		boolean isSchoolDay = true;
		
		if (isMorning) {
		System.out.println("Good Morning");
			if (isSchoolDay) 
			{
			System.out.println("you are in class");	
			}
			else 
			{	
			System.out.println("you are at home");
			}
			
		}
			
		else
		{
		System.out.println("Good Afternoon");
		}
		
	}

}
