package com.jdc.abstraction.demo1;

public class AsianElephant extends Elephant{
	
	public AsianElephant(String name) {
		super(name);
	}
	
	@Override
	void wash() {
		System.out.println("Mooo!!!");
		System.out.println("I love water!!! so happy");
	}
}
