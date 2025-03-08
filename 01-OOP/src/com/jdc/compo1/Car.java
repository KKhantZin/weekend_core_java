package com.jdc.compo1;

public class Car{
	
	// member data - dependency injection
	// HAS A relationship
	private Engine engine; // type 
	private ElectricEngine electricEngine; // specific type
	
	// Car make engine itself.
	public Car() {
		this.engine = new Engine("4 hp"); // tight coupling
		//this.electricEngine = new ElectricEngine();
	}
	
	void drive() {
		electricEngine.start();
		System.out.println("Car is driving.");
	}
}
