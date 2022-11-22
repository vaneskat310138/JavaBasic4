package com.neotech.lesson24;

public class StudentTest {

	public static void main(String[] args) {
		
		System.out.println("----- Student Object; Student");
		Student student = new Student();
		student.study();
		student.doHomework();
		// student.getJob();
				
		System.out.println("------ NeoTech Student Object; NeotechStudent");
		NeotechStudent neotech = new NeotechStudent();
		
		neotech.study();
		neotech.doHomework();
		neotech.getJob();
		
		System.out.println("------NeoTech Student Object; NeoTechStudent");
		Student st1;
		st1 = new NeotechStudent();
		
		Student st2 = new CollegeStudent();
		st1.study();
		st2.study();
		
		
		
		
		
		
	}
}
