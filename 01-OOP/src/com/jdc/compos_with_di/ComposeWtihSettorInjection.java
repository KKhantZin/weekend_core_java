package com.jdc.compos_with_di;

public class ComposeWtihSettorInjection {
	public static void main(String[] args) {
		Car2 car = new Car2();
		car.setEngine(new PetroEingine());
		car.drive();
	}
}
