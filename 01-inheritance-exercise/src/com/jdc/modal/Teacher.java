package com.jdc.modal;

public class Teacher extends Person {
	// name ,age
	String subject;
	int experience;
	
	public Teacher(String name, int age, String subject, int experience) {
		super(name, age);
		this.subject = subject;
		this.experience = experience;
	}
	
	@Override
	void introduce() {
		System.out.println("I am : " + name + " , " +
						   "teaching : " + subject + 
						   " for " + experience);
			
	}
	
	void learn() {
		System.out.println(name + " is teaching " + subject);
	}
	
}
