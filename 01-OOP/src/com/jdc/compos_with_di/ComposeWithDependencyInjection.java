package com.jdc.compos_with_di;

public class ComposeWithDependencyInjection {
	public static void main(String[] args) {
		Car c1 = new Car(new PetroEingine());
		c1.drive();
		
		Car c2 = new Car(new ElectriEngine());
		c2.drive();
		
		Car c3 = new Car(new MotorEngine());
		c3.drive();
	}
}
