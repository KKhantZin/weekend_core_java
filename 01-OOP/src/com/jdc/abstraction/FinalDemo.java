package com.jdc.abstraction;

public class FinalDemo {
	public static void main(String[] args) {
		var tc = new TestClass();
		
		//tc.display(); // 0, 100
		
		tc.value = 10;
		//tc.val = 200;
		//tc.display(); // 10
		
		var tcb = new TestClassB();
		tcb.doSomething();
		System.out.println(tcb.val);
	}
}

class TestClass {
	int value;
	
	final int val = 100;
	
	// can't access final keyword in constructor, cuz constructor construct an object.
	public TestClass() {
		
	}
	
	void display() {
		System.out.println("Value : " + value);
		System.out.println("Final Value : " + val);
	}
	
	final void doSomething() {
		System.out.println("Do something method from TestClass.");
	}
}

class TestClassB extends TestClass {
	
//	@Override
//	void doSomething() {
//		System.out.println("Do something method from TestClassB.");
//	}
}
