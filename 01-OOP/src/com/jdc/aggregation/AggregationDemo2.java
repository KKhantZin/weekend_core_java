package com.jdc.aggregation;

public class AggregationDemo2 {
	public static void main(String[] args) {
		EngineClass1 eng = new EngineClass1("Disel");
		CarClass1 bus = new CarClass1(eng);
	}
}

class CarClass1 {
	private EngineClass1 engine;
	
	public CarClass1(EngineClass1 engine) {
		this.engine = engine;
	}
}

class EngineClass1 {
	
	private String type;
	
	public EngineClass1(String type) {
		this.type = type;
	}
	
}
