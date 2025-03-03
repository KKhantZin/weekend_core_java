package com.jdc.inherit;

public class Main {
	public static void main(String[] args) {
		Eagle e1 = new Eagle();
		
		// Override from Parent Class
		e1.name = "Eagle";
		e1.fly(); // parent
		e1.walk();
		
		// From Child Class
		e1.eat();
		System.out.println();
		
		// Eagle is a Bird
		// But, Every Bird can't be Eagle.
		Bird b1 = new Eagle(); 
		
		b1.name = "Penguin";
		b1.fly();
		b1.walk();
		
		//b1.eat();

		
		
	}
}
