package com.jdc.abstraction.demo1;

// concrete class can extends abstract class
// must be override abstract method from abstract class
public class Monkey extends Animal{
	
	Monkey (String name) {
		super(name);
	}
	
	// must override abstract method from abstract class
	@Override
	void feed(String food) {
		System.out.println("Kwi Kwi !!! I like " + food);
	}
	
	void dance() {
		System.out.println("I can dance kwi kwi!!!.");
	}
}
