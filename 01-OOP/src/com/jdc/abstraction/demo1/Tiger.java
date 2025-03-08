package com.jdc.abstraction.demo1;

public class Tiger extends Animal{

	Tiger(String name) {
		super(name);
	}
	
	void feed(String food) {
		if(food.equals("meat")) {
			System.out.println("Wow !!! Yummy.");
			System.out.println("I love " + food);
		} else {
			System.out.println("Oh !!! I hate " + food);
		}
	}
}
