package com.jdc.modal;

public class Student extends Person{
	String studentId;
	double gpa;
				  // Mg Mg      // 25
	public Student(String name, int age, String studentId, double gpa) {
		//System.out.println(); // error - no one exit on the super
		super(name, age);
		this.studentId = studentId;
		this.gpa = gpa;
	}
	
	@Override
	void introduce() {	
		System.out.println("I am : " + name + " , " + 
				           "ID : " + studentId + " , " +
				           "GPA : " + gpa);
	}
	
	void study() {
		System.out.println(name + " ");
	}
}
