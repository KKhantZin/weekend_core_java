package com.jdc.open_vs_close;

public class WithOCP {
	public static void main(String[] args) {
		
		Circle c1 = new Circle(5);
		Rectangle r1 = new Rectangle(5, 7);
		Triangle t1 = new Triangle(4, 6);
		
		AreaCalculator1 a1 = new AreaCalculator1();
		System.out.println("Circle Area : " + a1.calculateArea(c1));
		System.out.println("Rectangle Area : " + a1.calculateArea(r1));
		System.out.println("Triangle Area : " + a1.calculateArea(t1));
	}
}
