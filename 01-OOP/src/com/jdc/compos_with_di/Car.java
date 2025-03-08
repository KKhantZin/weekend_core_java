package com.jdc.compos_with_di;

public class Car {
	private Engine engine; 
	
	public Car(Engine engine) { // create dependency injection from outside.
		this.engine = engine;
	}
	
	public void drive() {
		engine.start();
		System.out.println("Car is driving.");
	}
}
