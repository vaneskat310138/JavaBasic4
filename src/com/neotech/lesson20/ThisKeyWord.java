package com.neotech.lesson20;

public class ThisKeyWord {

	int a,b;
	
	ThisKeyWord()
	{}
	
	ThisKeyWord(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	
	
	
	void sum(int a, int b)
	{
		System.out.println("Sum of local variables is " + (a+b));
		System.out.println("Sum of instance variables is " + (this.a + this.b));
	}
}
