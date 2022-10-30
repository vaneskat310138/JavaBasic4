package com.neotech.homework;

import java.util.Scanner;

public class HomeworkRecap {

	public static void main(String[] args) {
		
		//Ask the user to enter an integer and build the following pattern:
		//Hint: Use scanner, if user entered number 5, there should be 5 rows.
		//In the first row, 0 spaces, (2 * 5) - 1 stars
		//In the second row, 1 spaces, (2 * 4) - 1 stars
		//In the third row, 2 spaces, (2 * 3) - 1 stars
		//In the fourth row, 3 spaces, (2 * 2) - 1 stars
		//In the fifth row, 4 spaces, (2 * 1) - 1 stars

		//	*********
		//	 *******
		//	  *****
		//	   ***
		//	    *
		
		
		
		Scanner input = new Scanner (System.in);
		System.out.println("Print the number of rows");
		int num = input.nextInt();
		
		for(int a = 1; a <= num; a++)
		{
			for(int b = 1; b < a; b++)
			{
				System.out.print(" ");
			}
			for(int c = 1; c <= 2 * (num - a) + 1; c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
			System.out.println("_________________________________");

		
			

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
