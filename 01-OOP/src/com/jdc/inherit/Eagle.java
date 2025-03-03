package com.jdc.inherit;

// Is-A relationship
// Eagle is a Bird
// But, Every Bird can't be Eagle.
// Eagle can inherit state vs behavior of Bird.
public class Eagle extends Bird{
	
	void eat() {
		System.out.println(name + " eats fresh meat.");
	}
	
	// same type, name, argument list
	//@Override
	void fly(String name) {
		System.out.println(name + " can fly lonely.");
	}
}
