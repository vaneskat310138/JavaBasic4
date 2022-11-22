package com.neotech.lesson20;

public class Homework1 {
	//Create a method that will accept a String as a parameter 
	//and return a new String that consist only of vowels. 
	//Method should be available inside the class where it was 
	//declared and executed by calling it is name.
	
	private static String getVowels(String str)
	{
		String result =str.replaceAll("[^aeiouAEIOU]","");
		
		
			
			return result;
	}
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println(getVowels("Good Evening"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
