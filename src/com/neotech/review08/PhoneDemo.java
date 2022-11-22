package com.neotech.review08;

public class PhoneDemo {

	public static void main(String[] args) {
		Phone p = new Phone("S1234","Samsung","pass@1234");
		
		p.displayInfo();
		
		String serial = p.getSerialNumber("pass@1234");
		System.out.println("The serial number is " + serial);
		
		//is only setting because it is 7 characters long 
		p.setSerialNumber("ai17374");
		p.displayInfo();
		
		System.out.println(p.getSerialNumber("pass@1234"));
		
		System.out.println("--------------------");
		
		String phoneBrand = p.getBrand();
		System.out.println("The brand is " + phoneBrand);
		
		//I can not change the brand because 
		//i don't have a setter method
		//p.setBrand("Apple");
	}
}
