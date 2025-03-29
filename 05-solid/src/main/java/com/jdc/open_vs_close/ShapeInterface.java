package com.jdc.open_vs_close;

public interface ShapeInterface {
	double calculateArea();
}

class AreaCalculator1 {
	public double calculateArea(ShapeInterface shape) {
		return shape.calculateArea();
	}
}

class Triangle implements ShapeInterface {
	private double base;
	private double height;
	
	public Triangle (double base , double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return 0.5 * base * height;
	}
}

class Rectangle implements ShapeInterface {
	private double width;
	private double height;
	
	public Rectangle (double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return width * height;
	}
}

class Circle implements ShapeInterface {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
	
	
}
