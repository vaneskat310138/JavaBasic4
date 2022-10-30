package com.neotech.lesson04;

public class RelationalEqualityOperators {
	
	public static void main(String[] args) {
		
		System.out.println(6>8);

	int a = 6;
	int b = 8;
	
	System.out.println(a>b);
	System.out.println(b>a);
	
	int c = 8;
	System.out.println(c>b);
	System.out.println(c == b);
	System.out.println(c !=b);

	double d1 = 10.3;
	double d2 = 10.3;
	
	boolean result1 = (d1>d2);
	System.out.println(result1);
	
	boolean result2 = (d1 == d2);
	System.out.println(result2);
	
	
	}
	
}
