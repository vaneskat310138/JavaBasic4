package com.neotech.review02;

public class DoWhileDemo {

	public static void main(String[] args) {
		
		int age = 5;
		
		while (age <= 10)
		{
			System.out.println("Happy birthday, you are " + age + " years old");
		age++;
		}
		
		System.out.println("__________________________");
		
		
		//DO WHILE
		
		int age2 = 5;
		
		do 
		{
			System.out.println("Happy birthday, you are " + age2 + " years old");
		age2++;	
		}
		while (age2 <=10);
		
		System.out.println("__________________________");
		
		//FOR LOOP print 11 to 20 skip 13 
		
		for(int a = 11; a <= 20; a++)
		{
			if (a == 13)
			{
				continue;
			}
			System.out.println("happy "+ a + " birthday");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
