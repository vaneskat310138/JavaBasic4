package com.neotech.lesoon10;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//iterate though a number 5 times
		// outer loop
		for (int i =0; i<5; i++)
		{
			//inner loop
			for (int j = 0; j < 5; j++)
			{
				System.out.println("i: " + i + " j: " + j);
			}  //end of inner loop
			
		}//end of outer loop
	}

}
