package com.neotech.lesson14;

public class Student {
//features:
	//firstName, lastName, studentId, school, gender, grade
	
	String firstName, lastName, school;
	int studentId;
	char gender;
	char grade;
	
	//behaviors: when is the same for all of them
	//study(), doHomework ()
	
	void study()
	{
		System.out.println(firstName + " " + lastName + " is studying");
	}
	void doHomework ()
	{
		System.out.println(firstName + " is doing homework");
	}
	
}
