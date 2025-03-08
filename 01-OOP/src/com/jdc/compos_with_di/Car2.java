package com.jdc.compos_with_di;

public class Car2 {
	
	private Engine engine;
	
	public void setEngine(Engine engine) { // inject with settor
		this.engine = engine;
	}
	
	public void drive() {
		engine.start();
		System.out.println("Car is driving.");
	}
	
}
