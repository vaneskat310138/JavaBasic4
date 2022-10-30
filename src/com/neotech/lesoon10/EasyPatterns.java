package com.neotech.lesoon10;

public class EasyPatterns {

	public static void main(String[] args) {

		// *****
		// ****
		// ***
		// **
		// *

		// not a good solution
		for (int i = 0; i < 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < 4; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < 2; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < 1; i++) {
			System.out.print("*");
		}

		System.out.println("\n___________________");

		// with nested loops
		for (int row = 5; row > 0; row--) {
			for (int col = 0; col < row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("\n___________________");

		// print $$$$$
		// $$$$$
		// $$$$$
		// $$$$$

		for (int b = 1; b <= 5; b++) {
			for (int c = 1; c <= 5; c++) {
				System.out.print("$");
			}

			System.out.println();
		}

		System.out.println("\n___________________");

		// print $$$$$
		//		 $   $
		// $ $
		// $$$$$

		for (int b = 1; b <= 4; b++) {
			for (int c = 1; c <= 5; c++) {
				if (b == 1 || b == 4 || c == 1 || c == 5) {
					System.out.print("$");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println("___________________");

		// print *
		// **
		// ***
		// ****
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("___________________");

		// print 1111
		// 2222
		// 3333
		// 4444

		for (int row2 = 1; row2 <= 4; row2++) {
			for (int col2 = 1; col2 <= 4; col2++) {
				System.out.print(row2);
			}
			System.out.println();
		}

		System.out.println("___________________");

		// print 1234
		// 		 1234  
		// 		 1234
		// 		 1234

		for (int row2 = 1; row2 <= 4; row2++) {
			for (int col2 = 1; col2 <= 4; col2++) {
				System.out.print(col2);
			}
			System.out.println();
		}

	}
}
