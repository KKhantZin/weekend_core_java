package com.jdc.abstraction.demo1;

public abstract class Elephant extends Animal{ 
	
	Elephant(String name) {
		super(name);
	}
	
	// may or may not override abstract from abstract class(Animal)
	void feed(String food) {
		System.out.println("I am eating " + food);
		System.out.println("Mooo Mooo");
	}
	
	abstract void wash();

}
