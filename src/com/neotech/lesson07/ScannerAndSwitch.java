package com.neotech.lesson07;

import java.util.Scanner;

public class ScannerAndSwitch {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String country;

		System.out.println("Where are you from");
		country = scan.next();

		if (country.equals("Albania")) {
			System.out.println("you speak Albanian");
		} else if (country.equals("Ecuador") || country.equals("Colombia")) {
			System.out.println("you speak spanish");
		} else
			System.out.println("I dont know your language");

		System.out.println("____________________________________________");

		switch (country) {

		case "Turkey":
			System.out.println("you speak Turkish");
			break;
		case "Albania":
			System.out.println("you speak ALbanian");
			break;
		case "Ecuador":
			System.out.println("you speak spanish");
			break;
		default:
			System.out.println("I dont know your language");
		}

	}
}
