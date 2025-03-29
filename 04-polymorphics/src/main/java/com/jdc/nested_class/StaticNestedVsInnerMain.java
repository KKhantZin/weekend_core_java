package com.jdc.nested_class;

public class StaticNestedVsInnerMain {
	public static void main(String[] args) {
		
		System.out.println(OuterClass.outerStaticVariable);
		System.out.println(new OuterClass().outerInstanceVariable);
		
		// for static class
		OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
		nested.display();
		System.out.println();
		
		// for non-static class
		OuterClass.NonStaticInnerClass inner = new OuterClass().new NonStaticInnerClass();
		inner.display();
		System.out.println();
		
		// for local class
		OuterClass local = new OuterClass();
		local.myMethod();
		
		System.out.println(OuterClass.outerStaticVariable);
		OuterClass.StaticNestedClass nest = new OuterClass.StaticNestedClass();
		
		OuterClass obj = new OuterClass();
		System.out.println(obj.outerInstanceVariable);
		
		OuterClass obj1 = new OuterClass();
		OuterClass.NonStaticInnerClass inn = obj1.new NonStaticInnerClass();
		OuterClass.NonStaticInnerClass inn1 = new OuterClass().new NonStaticInnerClass();
		
	}
}

class OuterClass {
	
	// Global
	static int outerStaticVariable = 10;
	int outerInstanceVariable = 20;
	
	// static nested class
	static class StaticNestedClass {
		static void display() {
			System.out.println("Static Nested Class");
			System.out.println("Outer static varaiable : " + outerStaticVariable);
		}
	}
	
	// non-static inner class
	class NonStaticInnerClass {
		void display() {
			System.out.println("Non Static Inner Class.");
			System.out.println("Outer static varaiable : " + outerStaticVariable);
		}
	}
	
	// local class
	void myMethod() {
		class LocalInnerClass {
			void display() {
				System.out.println("Hello from Loacl Inner Class.");
			}
		}
		
		LocalInnerClass local = new LocalInnerClass();
		local.display();
		
	}
}
