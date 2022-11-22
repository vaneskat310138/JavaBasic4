package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
	
	public static void main(String[] args) {
		
				/*
				 * Create an arrayList of words. Remove every word that ends with “e”. Use
				 * iterator
				 */		
				
				ArrayList<String> words = new ArrayList<>();
				
				words.add("hello");
				words.add("water");
				words.add("sweets");
				words.add(1,"apple");
						
				System.out.println(words);
				
				Iterator<String> iter = words.iterator();
				
				while(iter.hasNext())
				{
					String word = iter.next();
					
					if (word.endsWith("e"))
					{
						iter.remove();
					}
					
				}
				
				System.out.println(words);
				
			}

}
