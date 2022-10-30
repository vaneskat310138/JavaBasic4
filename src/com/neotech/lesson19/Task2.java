package com.neotech.lesson19;

public class Task2 {
	
	public static String reverse(String str)
	{
		String reverse = "";
		for (int i = str.length()-1; i>=0; i--)
		{
			reverse +=str.charAt(i);
		}
		
		return reverse;
	}	
		
	
	

}
