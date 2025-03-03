package com.jdc.inherit2;

public class ParentCar {
	
	String name;
	
	public ParentCar(String name) {
		this.name = name;
		System.out.println("Arguement Constructor ::: Parent Class.");
	}
		
	void start() {
		System.out.println("Engine is start");
	}
	
	void drive() {
		System.out.println("Car is driving.");
	}
}

class BMW extends ParentCar {
	// start, drive
	String name;
	public BMW(String name) {
		super("Parent"); // Parent Constructor
		this.name = name;
		System.out.println("Default Constructor ::: Child Class");
	}
	
	void fast() {
		System.out.println("BMW is so fast.");
	}
	
	@Override
	void start() {
		System.out.println("When engine started, I can so fast.");
	}
}

