package com.neotech.lesson09;

public class ForTask1 {

	public static void main(String[] args) {
		
		//print numbers from 1 to 100
		for(int a = 1; a <= 100; a++)
		{
			System.out.print(a + " ");
		}
		
		System.out.println("\n_________________");
		
		//PRINT NUMBERS FROM 100 TO 1
		
		for(int b = 100; b >= 1; b--)
		{
			System.out.print(b + " ");
		}
		
		System.out.println("\n_________________");
		
		// PRINT EVEN NUMBERS FROM 20 TO 1 (2 WAYS)
		
		for (int c = 20; c >= 1; c-=2)
		{
			System.out.print(c + " ");
		}
		
		System.out.println("\n_________________");
		
		for (int c = 20; c >= 1; c--)
		{
			if(c % 2 == 0)
			{
				System.out.print(c + " ");
			}
			
		}
		
		// PRINT ODD NUMBERS FROM 21 TO 50 (2 WAYS)
		
		System.out.println("\n_________________");
		
		for (int c = 21; c <= 50; c+=2)
		{
			System.out.print(c + " ");
		}
		
		System.out.println("\n_________________");
		
		for (int c = 20; c <= 50; c++)
		{
			if(c % 2 == 1)
			{
				System.out.print(c + " ");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
