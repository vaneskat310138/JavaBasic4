package com.neotech.lesson18;

public class Homework1 {
	//Create a String and print it in reverse order 
	//Solve it using charAt(), toCharArray() and reverse() methods.
	//Note:
		//for charAt() and toCharArray() use String
		//for reverse you have to declare a StringBuffer object
	public static void main(String[] args) {
		String str = "Sunday";
		
		//1st way using char()
		//System.out.println(str.charAt(0));
		for (int i = str.length()-1; i>=0; i--)
		{
			char c = str.charAt(i);
			System.out.print(c);
		}
		
		System.out.println("\n--------------------");
		
		//2nd way, using ToCharArray()
		char[] charArray = str.toCharArray();
		for (int i = str.length() -1; i>=0; i--) {
			char c =charArray[i];
			System.out.print(c);
		}
		
		System.out.println("\n--------------------");
		
		//3rd way using reverse with StringBuffer
		StringBuffer strBuffer = new StringBuffer(str);
		strBuffer.reverse();
		System.out.println(strBuffer);
		}
	
	
	
	
}
