package com.neotech.lesson19;

public class Task1 {
	
	//Create a method that will accept an array as
		//parameters and will return a sum of all elements from
		//that array. Method should be visibly only within same
		//package and accessible by the creating an instance
		//of the class.
	
	//method:
	//return type: sum
	//parameters
	
	int sum(int[] arr)
	{
		int sum = 0;
		
		for (int element : arr)
		{
			sum += element;
		}
		
		
		
		return sum;
	}
	
	
	
	
	
	
	

	
	
}
