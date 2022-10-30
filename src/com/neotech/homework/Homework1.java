package com.neotech.homework;

public class Homework1 {

	public static void main(String[] args) {

		boolean allergies = true;
		boolean peanut = true;
		boolean lactose = true;
		boolean bee = false;
		boolean seafood = true;

		if (allergies) {
			System.out.println("You have allergies");

			if (peanut) {
				System.out.println("Don't eat peanuts");
			}
			if (lactose) {
				System.out.println("Don't eat lactose");
			}
			if (bee) {
				System.out.println("Becareful with bees");
			}
			if (seafood) {
				System.out.println("Don't eat seafood");
			}

		} else {
			System.out.println("You are healthy");
		}

	}

}
