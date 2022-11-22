package com.neotech.lesson28;

import java.util.ArrayList;

public class ArrayListNonGeneric {
	
	public static void main(String[] args) {
		
				//Generic ArrayList
				ArrayList<Double> al = new ArrayList<>();
		
				al.add(2.5);
				al.add(4.7);
				al.add(2.3);
				al.add(5.5);
				//al.add(100);//CE, this is not converted automatically
				//al.add("five"); //CE
				
				System.out.println(al);
				
				//replacing items in the ArrayList
				al.set(1, 10.2); 
				//if the index is larger than the size of the arrayList, then you will get
				// an IndexOutOfBoundsException 
				System.out.println(al);
				
				//removing an element
				al.remove(0);
				//al.remove(2.5) if you want to remove be object 
				
				System.out.println(al);
				
				//get an element at the index 0??
				
				System.out.println(al.get(0));
				
				//for loop
				for (int i = 0; i < al.size(); i++)
				{
					//arr[i]
					System.out.print(al.get(i)+ " ");
				}
				
				System.out.println();
				
				//for-each loop
				//java automatically does auto-boxing and auto-unboxing, so we can use Double or double
				for(Double d : al)
				{
					System.out.print(d + " ");
				}
				
				System.out.println("=============================");
				
				
				
				//Non-generic Arraylist
				
				ArrayList al2 = new ArrayList();
				
				al2.add(100); //storing an integer object
				al2.add("Hello"); //storing a String object
				al2.add('A'); //storing a Character object
				al2.add(al); //storing an ArrayList object
				
				System.out.println(al2);
				
				//retrieving all elements from Non-Generic ArrayList
				for (Object obj : al2)
				{
					System.out.println(obj);
				}
				
				
			}
		

}
