package com.neotech.lesson21;

public class School {

	public static void main(String[] args) {
		
		MathTeacher a = new MathTeacher();
		a.subject = "Math";
		a.grade = 5;
		
		a.teaches();
		a.math();
		
		System.out.println("------------------");
	
		ChemistryTeacher b = new ChemistryTeacher();
		b.subject = "Chemistry";
		b.grade = 90;
		
		b.teaches();
		b.chemistry();
	
		System.out.println("------------------");
		
		PianoTeacher c = new PianoTeacher();
		c.subject = "Plays piano";
		c.grade = 5;
		
		c.teaches();
		c.play();
		
		
		
	}
}
