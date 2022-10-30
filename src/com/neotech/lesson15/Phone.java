package com.neotech.lesson15;

public class Phone {

	String brand, color,model;
	int price;
	
	void call()
	{
		System.out.println(brand + " calls");
	}
	void text ()
	{
		System.out.println(brand + " send texts");
	}
	void navigate()
	{
		System.out.println(brand + " navigates");
	}
	
	
}
