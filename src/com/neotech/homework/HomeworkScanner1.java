package com.neotech.homework;

import java.util.Scanner;

public class HomeworkScanner1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter your height in inches");
		int height = input.nextInt();
		
		
		if(height < 60)
		{
			System.out.println("You are short");
		}
		else if(height >= 60 && height <= 72)
		{
			System.out.println("Medium height");
		}
		else
		{
			System.out.println("You are tall");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
