package com.neotech.lesson20;

public class Students {
	
	String name;
	int a,b,c;
	
	Students (String name1, int gradea, int gradeb, int gradec)
	{
		System.out.println("Student " + name1);
		name = name1;
		a = gradea;
		b = gradeb;
		c = gradec;
	}
	
	
	
	void printAverage()
	{
		System.out.println("Average is " + (a+b+c)/3);
	}
}
