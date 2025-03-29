package com.jdc.dip;

public class WithoutDIP {
	public static void main(String[] args) {
		Computer c1 = new Computer();
		c1.start();
	}
}

class Keyboard {
	public void type() {
		System.out.println("Typing with keyboard.");
	}
}

class Computer {
	private Keyboard keyboard = new Keyboard(); // directl dependency injection
	
	public void start() {
		keyboard.type();
	}
}
