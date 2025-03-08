package com.jdc.aggregation;


public class AggregationDemo1 {
	public static void main(String[] args) {
		CarClass car = new CarClass("Electirc");
	}
}

class CarClass {
	private EngineClass engine;
	
	public CarClass(String enginType) {
		this.engine = new EngineClass(enginType);
	}
}

class EngineClass {
	
	private String type;
	
	public EngineClass(String type) {
		this.type = type;
	}
	
}
