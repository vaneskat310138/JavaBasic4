package com.neotech.homework;

public class HomeworkLesson8 {

	public static void main(String[] args) {

		// print the sum of even numbers from 1 to 10
		int i = 0;
		int sum = 0;

		while (i <= 10) 
		{
			if (i % 2 == 0) 
			{
			sum += i; 

			}

			i++;
		}
		System.out.println("the total sum is: "+ sum);
		
		
		System.out.println("_________________________________________");
		
		// 2nd OPTION
		
		int j = 0;
		int total = 0;
		while (j<=10)
		{
			total += j;
			
			j += 2;
		}

		System.out.println("the total is: " + total);
	}

}