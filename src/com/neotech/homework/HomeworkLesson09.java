package com.neotech.homework;

import java.util.Scanner;

public class HomeworkLesson09 {

	public static void main(String[] args) {
		
		//Print numbers from 1 to 50 except those that are divisible by 3
		for(int a = 1; a <=50; a++)
		{
			if (a % 3 == 0)
			{
				continue;
			}
			System.out.print(a + " ");
		}
		
		System.out.println("\n___________________");
		
		//2. Write a program that asks user to enter his/her username
		//   and password until user enters them correctly.
				
		Scanner scan = new Scanner(System.in);
		
		String userName = "Vanesa";
		String password = "123456";
		
		String userNameInput;
		String passwordInput;
				
		do 
		{
			System.out.println("Enter username and password");
			userNameInput = scan.next();
			passwordInput = scan.next();
			
			if (userNameInput.equals(userName) && passwordInput.equals(password))
			{
				System.out.println("You are now logged in");
				break;
			}
			else
			
				System.out.println("Wrong username or password");
		}	
			
		while (userNameInput != userName || passwordInput != password);
		
		
		
		
		//Create a program that will be asking user to apply for a credit card 10 times.
		//As soon you get an "yes" from a user program should stop asking.
		
		Scanner scann = new Scanner(System.in);
		String input;

		for(int times = 1; times <=10; times++)
		{
			System.out.println("do you want to Enter credit card now");
			input = scann.next();
			
			if (input.equals("yes"))
			{
				System.out.println("Enter credit card");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
		
	}
		
		
		
