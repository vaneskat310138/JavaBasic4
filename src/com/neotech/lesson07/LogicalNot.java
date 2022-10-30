package com.neotech.lesson07;

public class LogicalNot {

	public static void main(String[] args) {
		
		boolean b1 = !true;
		System.out.println(b1);
		
		boolean b2 = !false;
		System.out.println(b2);

		System.out.println(!(6<5));
		
		boolean cold = false;
		
		if (!cold)
		{
			System.out.println("it is cold");
		}
		
		int x = 6;
		
		if (x == 12)
		{
			System.out.println("x is 12");
		}
		else
		{
			System.out.println("x is NOT 12");
		}
		
		if (x != 12)
		{
			System.out.println("x is NOT 12");				
		}
		
		
		
		
	}
}
