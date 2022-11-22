package com.neotech.lesson20;

public class ConstructorTypes {

	String name;
	int age;
	
	//default constructor
	//no return types not even void
	//same name as the class
	//no parameters
	ConstructorTypes()
	{
		System.out.println("I am a non argument constructor");
	}
	
	//we can have parameters in constructors
	//signature: (String)
	ConstructorTypes(String str)
	{
	System.out.println("I am a constructor with a string" + str);	
	}
	
	//signature: (int)
	ConstructorTypes(int num)
	{
		System.out.println("I am a constructor with an int" + num);
	}
	
	//signature: (double)
	ConstructorTypes(double d)
	{
		System.out.println("I am a constructor with double" + d);
	}
	
	//signature: (string, int)
	ConstructorTypes(String str, int num)
	{
		System.out.println("I am a constructor with a String " + str + "and a int" + num);
	}
	
	//signature: (String, String)
	ConstructorTypes (String str, String str2)
	{
		System.out.println("I am a constructor with two Strings: " + str + " " + str2);
	}
	
		
	public static void main(String[] args) {
		
		//default constructor
		ConstructorTypes ct = new ConstructorTypes();
		System.out.println(ct.name + " " +ct.age);
		
		//parameter constructor
		ConstructorTypes ct1 = new ConstructorTypes("Sabah");
		
		ConstructorTypes ct2 = new ConstructorTypes("Vanesa", 30);
		
		//ConstructorTypes ct2 = new ConstructorTypes("Vanesa", "Michael", "Sabah");
		//last method will complain because we didnt create any constructor with 3 strings
	}
}
