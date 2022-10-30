package com.neotech.lesson08;

public class PreIncrementAndPostIncrement {

	public static void main(String[] args) {

		int x;

		int y = 10;

		// Post Increment means the result is the variable first and then
		// do the operation
		x = y++;

		System.out.println(x);
		System.out.println(y);

		// PRE Increment means do the operation first and then
		// give the result;

		int a;

		int b = 15;

		a = ++b;

		System.out.println(a);
		System.out.println(b);

		// DECREMENT

		int c;

		int d = 10;

		// Post Decrement means the result is the variable first and then
		// do the operation
		c = d--;

		System.out.println(c);
		System.out.println(d);

		// PRE Decrement means do the operation first and then
		// give the result;

		int e;

		int f = 15;

		e = --f;

		System.out.println(e);
		System.out.println(f);

	}
}
