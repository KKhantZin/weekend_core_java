package com.jdc.abstraction.demo1;

public class Zoo {
	
	private Animal [] animals = new Animal[10];
	
	boolean add(Animal animal) {
		
		for (int i = 0; i < animals.length; i++) {
			if(animals[i] == null) {
				animals[i] = animal;
				return true;
			}
		}
		return false;
	}
	
	void wash() {
		for (Animal a : animals) {
			
			if(a instanceof Elephant) {
				Elephant e = (Elephant) a;
				e.wash();
				System.out.println();
			}
		}
	}
	
	void feed(String food) {
		for (Animal a : animals) {
			if(null != a) {
				a.feed(food);
				System.out.println();
			}
		}
	}
}
