package com.jdc.inherit2;

public class Main {
	public static void main(String[] args) {
		
		BMW bmw = new BMW("Hello");
		// start, drive
		// fast
		
		//ParentCar pCar = new ParentCar();
		// start, drive
		// pCar.fast(); // ParentCar(Super) can't drive from Child class
		
		//ParentCar pC = new BMW();
		// start, drive
		//pC.start(); // "When engine started, I can so fast."
		
	}
}
