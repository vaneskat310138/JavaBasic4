package com.neotech.lesson05;

public class TaskNestedIf {
	
	public static void main(String[] args) {
		
		boolean Friday = true;
		int date = 15;
				
		if (Friday) 
		{
		System.out.println("Its Friday, Im going to watch a movie");	
			if (date == 13) 
			{
				System.out.println("I will watch a scary movie");
			}
			else 
				System.out.println("I will watch a comedy");
		}
		else
		{
		System.out.println("Its not Friday. Im going to study Java");
		}
	}

}
