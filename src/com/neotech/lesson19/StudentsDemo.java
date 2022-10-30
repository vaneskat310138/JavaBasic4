package com.neotech.lesson19;

public class StudentsDemo {

	public static void main(String[] args) {
	
		Students st1 = new Students();
		st1.studentName = "Oktay";
		st1.studentId = 1;
		//increment the number of students
		//for static always use the class 
		Students.numberOfStudents++;
		
		Students st2 = new Students();
		st2.studentName = "Harkan";
		st2.studentId = 1;
		Students.numberOfStudents++;
		
		Students st3 = new Students();
		st3.studentName = "Vanesa";
		st3.studentId = 1;
		Students.numberOfStudents++;
		
	}
	
}
