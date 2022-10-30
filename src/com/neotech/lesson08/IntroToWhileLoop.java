package com.neotech.lesson08;

public class IntroToWhileLoop {

	public static void main(String[] args) {

		int time = 8;

		if (time < 9) {
			System.out.println("Good Evening");
		}

		while (time < 67) {
			System.out.println(time);

			time++;
		}

		// SECOND EXAMPLE
		int a = 2;
		// will print until it gets to 30
		while (a < 0)
			System.out.println("Condition: " + (a < 30));

		System.out.println(a + " ");

		a++;

		//how do we print numbers 5 to 25
		
		int b = 5;
		
		while (b <=25)
		{
			System.out.println(b + " ");
			b++;
		}
		
		//Print numbers from 10 to 1
		
		int c =10;
		
		while (c >=1)
		{
			System.out.println(c + " ");
			c--;
		}
		
		
		
		
	}
}
