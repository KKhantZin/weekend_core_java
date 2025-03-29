package com.jdc.poly1;

public class PolyDemo1 {
	public static void main(String[] args) {
		// Polymorphism
		Bird b1 = new Bird(); // Bird object can use itself.
		Animal a1 = b1;
		Flyable f1 = b1;
		Object obj1 = b1;
	}
}

class Animal {
	
}

interface Flyable {
	
}

class Bird extends Animal implements Flyable {
	
}


