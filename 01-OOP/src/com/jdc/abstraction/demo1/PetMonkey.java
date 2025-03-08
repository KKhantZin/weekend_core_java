package com.jdc.abstraction.demo1;

public class PetMonkey extends Monkey{
	
	PetMonkey(String name) {
		super(name);
	}
	
	@Override
	void feed(String food) {
		System.out.println("I am pet monkey");
		System.out.println("Kwi Kwi !!! I like " + food);
	}
}
