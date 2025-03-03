package com.jdc.modal;

public class Person {
	
	String name;
	int age;
	
	// auto generate
	//public Person() {}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void introduce() {	
		System.out.println("Hi, I am " + name + " , " + age + " years old.");
	}
}
