package com.neotech.lesson09;

public class BreakAndContinue {
	public static void main(String[] args) {
		
		// it will run 10 times but if it reaches 5 
		// it will give a break or stop the loop
		
		for (int i = 1; i <= 10; i++)
		{
			if (i == 5)
			{
				break;
			}
		System.out.println(i);
		}
		
		
		for (int i = 1; i <= 10; i++)
		{
			if (i ==5)
			{
				continue;
			}	
			System.out.println(i);
			
			
			
		
	}
	}
}
