package com.neotech.review03;

import java.util.Scanner;

public class Scanner_2DArray {

	public static void main(String[] args) {
		
		// Create the array (String[][] names)
		// Fill the array
		// Print the array
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many rows do you want in the array?");
		int rows = input.nextInt();
		
		System.out.println("How many columns do you want in the array?");
		int cols = input.nextInt();
				
		String[][] names = new String [rows][cols];
		
		for(int i = 0; i < rows; i++)
		{
			for (int j = 0; j < cols; j++)
			{
				System.out.println("Please enter a name");
				names[i][j] = input.next();
			}
		}
		
		for (String[] row : names)
		{
			for (String name : row)
			{
				System.out.print(name + " ");
			}
			System.out.println();
		}
	}

}
