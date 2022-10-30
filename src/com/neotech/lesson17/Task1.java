package com.neotech.lesson17;

public class Task1 {
	public static void main(String[] args) {
		
		String a = "Is it saturday? Is it raining? Do we have a Java Class today?";
		
		String[] sentence = a.split("\\?");
		
		for (String sentence1: sentence)
		{
			System.out.print(sentence1 + "-");
		}
		System.out.println();
		System.out.println(sentence.length);
	
	
		//if we have different expressions

		String b = "Is it saturday! Is it raining? Do we have a Java Class today.";
		String[] array2 = b.split("[!?.]");
		for  (String str: array2)
		{
			System.out.println(str);
		}
	
	}
	

}
