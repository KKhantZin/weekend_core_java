package com.jdc.liskov;

public class LisKovPrinciple {
	public static void main(String[] args) {
		Flyable e = new Eagle();
		flyMethod(e);
		
		Bird ost = new Ostrich();
		ost.doSomething();
	}
	
	static void flyMethod(Flyable bird) {
		bird.fly();
	}
}

interface Flyable {
	void fly();
}

class Bird {
	void doSomething() {
		System.out.println("Do Something.");
	}
}

class Ostrich extends Bird {
}

class Eagle extends Bird implements Flyable{

	@Override
	public void fly() {
		System.out.println("I am Eagle.");
		System.out.println("I can fly.");
	}
}