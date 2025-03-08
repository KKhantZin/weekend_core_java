package com.jdc.abstraction.demo1;

public class ZooApp {
	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		
		Animal a1 = new Monkey("WuKong");
		Animal a2 = new AsianElephant("Mo Mo");
		Animal a3 = new PetMonkey("Nga Nyo");
		
		System.out.println(zoo.add(a1));
		System.out.println(zoo.add(a2));
		System.out.println(zoo.add(a3));
		
		zoo.feed("banana");
		
		
	}
}
