package com.neotech.lesson20;

public class ThisKeyWordDemo {

	public static void main(String[] args) {
		
		ThisKeyWord obj = new ThisKeyWord();
		obj.sum(10,20);
		System.out.println(obj.a + " " + obj.b);
		
							//signature: (int, int)
		ThisKeyWord obj2 = new ThisKeyWord(20,40);
		obj2.sum(100, 200);
		
	}
}
