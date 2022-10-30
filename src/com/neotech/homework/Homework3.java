package com.neotech.homework;

public class Homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 41;
		int remainder = number % 2;

		if (remainder == 0) {
			System.out.println("this is an even number");
		} else {
			System.out.println("this is an odd number");
		}

		//second method
		
		if (remainder == 1) {
			System.out.println("this is an odd number");
		} else {
			System.out.println("this is an even number");
		}
		
		//third method
		
		if (number %2 ==1)
		{
			System.out.println("this is an odd number");
		}
		else
		{
		System.out.println("this is an even number");	
		}
		
	}
}


