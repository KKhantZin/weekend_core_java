package com.jdc.abstraction.demo1;

public abstract class Animal {
	
	private String name;
	
	public Animal (String name) {
		this.name = name;
	}
	// abstract method
	abstract void feed(String food);
}
