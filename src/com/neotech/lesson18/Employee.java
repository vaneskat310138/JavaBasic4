package com.neotech.lesson18;

public class Employee {
	
	int eID, salary;
	static String CEO = "Elion";
	
	void printInfo()
	{
		System.out.println("eID: " +eID + "Salary: " +salary + "CEO: "+ CEO);
	}
public static void main(String[] args) {
	
	Employee emp1 = new Employee();
	emp1.eID = 1;
	emp1.salary = 50000;
	
	Employee emp2 = new Employee();
	emp2.eID = 2;
	emp2.salary = 90000;
	
	emp1.printInfo();
	emp2.printInfo();
	
	Employee.CEO = "Ahmet";
	emp1.printInfo();
	emp2.printInfo();
	
	
}
}
