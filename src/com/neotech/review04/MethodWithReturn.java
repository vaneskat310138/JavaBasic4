package com.neotech.review04;

public class MethodWithReturn {
	public static void main(String[] args) {
		String name = "Dardan";
		int numOfChars = name.length();

		System.out.println("The length of " + name + " is " + numOfChars);

		MethodWithReturn m = new MethodWithReturn();
		boolean res = m.isOdd(57);
		System.out.println("The number 57 is odd? " + res);

		// Printing in one step
		System.out.println(m.isOddEnhanced(90));

	}

	boolean isOdd(int num) {
		boolean result;

		if (num % 2 == 1) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

	// If this one is confusing, NO problem :)
	boolean isOddEnhanced(int num) {
		return num % 2 == 1;
	}
}
