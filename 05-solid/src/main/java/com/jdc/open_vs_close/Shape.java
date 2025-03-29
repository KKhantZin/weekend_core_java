package com.jdc.open_vs_close;

public class Shape {
	
	String type;
	
	public Shape(String type) {
		this.type = type;
	}
}

class AreaCalculator {
	public double calculateArea(Shape shape) {
		
		if(shape.type.equals("circle")) {
			// calculate circle area
			return Math.PI * 5 * 5;
			
		} else if(shape.type.equals("rectangle")) {
			// calculate rectangle area
			// width * height
			return 4 * 6;
		}
		
		return 0;
	}
}
