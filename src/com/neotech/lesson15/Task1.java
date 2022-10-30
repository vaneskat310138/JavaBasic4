package com.neotech.lesson15;

public class Task1 {

	void larger(int a, int b)
	{
		if (a<b)
			{
			System.out.println("larger number is " + b);
			}
		else
		{
			System.out.println("larger number is " + a);
					}
	}
	
	void evenorodd (int a)
	{
		if (a % 2 == 0)
		{
			System.out.println("the number " + a + " is even");
		}
		else
		{
			System.out.println("the number " + a + " is odd");
		}
	}
	
	void language (String country)
	{
		switch (country) 
		{
		case "US":
			System.out.println("Hello");
			break;
		case "Ecuador":
			System.out.println("Hola");
			break;
		case "Turkey":
			System.out.println("Merhaba");
			break;
		default:
			System.out.println("not detected");
			
		
		}
	}
	
	public static void main(String[] args) {
		
		Task1 task = new Task1();
		
		System.out.println("Larger number");
		 task.larger(2, 7);
		 
		 System.out.println("Odd or Even");
		 task.evenorodd(1);
		
		 System.out.println("Language");
		 task.language("Ecuador");
		 
		 
		
		
		
	}
	
}
