package com.neotech.review03;

import java.util.Scanner;

public class ScannerArray {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//ask for the size
		System.out.println("How many numbers do you want to store in the array");
		int size = input.nextInt();
		
		//create the array
		int [] array = new int [size];
		
		//read the number to store in the array
		for (int i = 0; i < size; i++)
		{
			System.out.println("Enter the number:");
			array[i] = input.nextInt();
		}
		
		//print the numbers from the array
		System.out.println("print the numbers");
		for (int i = 0; i < array.length; i++)
		{
			System.out.println(array[i] + ", ");
				
		}
		
		System.out.println();	
		
		//Print numbers using enhanced for loop
		System.out.println("print numbers using enhanced loop");
		for (int num : array)
		{
			System.out.println(num + " ");
		}
		
	}

}
