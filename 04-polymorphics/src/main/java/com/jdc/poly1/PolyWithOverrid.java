package com.jdc.poly1;

public class PolyWithOverrid {
	public static void main(String[] args) {
		Fish fish = new GoldenFish();
		fish.swim();
	}
}

class Fish {
	public void swim() {
		System.out.println("Fish can swimming.");
	}
}

class GoldenFish extends Fish {
	// swim method can invoke
}
