package com.neotech.lesson15;

public class Store {

	public static void main(String[] args) {
		
		Phone iphone = new Phone();
				
		iphone.brand = "Apple";
		iphone.color = "Red";
		iphone.model = "14 Pro";
		iphone.price = 2000;	
		
		iphone.call();
		iphone.text();
		iphone.navigate();
		
		Phone android = new Phone();
		
		android.brand = "Samsung";
		android.color = "Black";
		android.model = "S10";
		android.price = 500;
		
		android.call();
		android.text();
		android.navigate();
		
		
		
		
		
		
		
		
		
	}
}
