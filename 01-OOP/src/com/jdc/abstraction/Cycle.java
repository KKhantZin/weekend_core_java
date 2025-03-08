package com.jdc.abstraction;

public abstract class Cycle {
	
	final static int val1 = 100;
	static int val2;
	int val3;
	
	public Cycle(int val3) {
		this.val3 = val3;
	}
	
	// abstract
	// abstract keyword , type, name, argument list, no body
	public abstract void drive();
	
	// concrete method
	public void displayModel() {
		System.out.println("This brand is so good.");
	}
}
