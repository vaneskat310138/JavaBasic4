package com.neotech.lesson13;

public class LargestElement {

	public static void main(String[] args) {
		
		int [] numbers = {45,34, 87, 33, 15, 92, 13, 55};
		
		
		int largest = numbers[0];
		
		for (int i = 0; i < numbers.length; i++)
		{
		if (largest<numbers[i])
		{
			largest = numbers [i];
		}
			
		}
		System.out.println("the largest number is: " + largest);
	}
}
