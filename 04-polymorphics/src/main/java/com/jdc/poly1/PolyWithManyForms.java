package com.jdc.poly1;

public class PolyWithManyForms {
	public static void main(String[] args) {
		
		// They are bird.
		Bird1 b1 = new Eagle();
		Bird1 b2 = new Crow();
		
		b1.fly();
		b2.fly();
	}
}

class Bird1 {
	public void fly() {
		System.out.println("Bird is flying.");
	}
}

class Eagle extends Bird1 {

	@Override
	public void fly() {
		System.out.println("Eagle is flying.");
	}
}

class Crow extends Bird1 {

	@Override
	public void fly() {
		System.out.println("Craw is Flying.");
	}
}

