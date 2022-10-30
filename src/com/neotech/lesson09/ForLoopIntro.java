package com.neotech.lesson09;

public class ForLoopIntro {

	public static void main(String[] args) {

		// print from 1 to 10

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}

		System.out.println("_____________________________________");

		// print number 21 to 30

		for (int a = 21; a <= 30; a++) {
			System.out.print(a + " ");
		}

		System.out.println("_____________________________________");

		// print number 20 to 1

		for (int b = 20; b >= 1; b--) {
			System.out.print(b + " ");
		}

		System.out.println("_____________________________________");

		// Print odd numbers from 1 to 10
		for (int c = 1; c <= 10; c++) {
			if (c % 2 == 1) {
				System.out.print(c + " ");
			}
		}

		System.out.println("_____________________________________");

		// Print odd numbers from 1 to 10
		for (int c = 1; c <= 10; c += 2) {
			System.out.print(c + " ");
		}

		System.out.println("_____________________________________");

		// Print the sum of numbers from 3 to 7
		
		int sum = 0;
		for (int d = 3; d <= 7; d ++) 
		{
			sum += d;
		}
		System.out.print("Sum is: " + sum);
	}

}
