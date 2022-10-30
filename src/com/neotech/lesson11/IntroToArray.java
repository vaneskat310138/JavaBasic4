package com.neotech.lesson11;

public class IntroToArray {
	public static void main(String[] args) {
		
		int []array1 = new int [10];
	
	array1 [0] = 10;
	array1 [1] = 15;
	array1 [2] = 20;
	array1 [3] = 25;
	
	System.out.println(array1[2]);
	
	System.out.println("___________________________");

	//String arrays
	
	String [] strArray = new String [4];
	
	strArray[0] = "New York";
	strArray[1] = "New Jersey";
	strArray[2] = "Atlanta";
	strArray[3] = "Colorado";
	
	System.out.println("I live in " + strArray[0]);
	
	System.out.println("___________________________");
	
	char[] letters = new char[6];
	
	letters[3] = 'C';
	letters[5] = 'A';
	letters[0] = 'B';
	letters[1] = 'X';
	
	
	System.out.println("The letter at index 4 is: " + letters[5]);
	
	letters[5] = 'Y'; //reassigning
	
	System.out.println("The letter at index 4 is: " + letters[5]);
	
	
	

	
	
	
	
	
	}
	

}
