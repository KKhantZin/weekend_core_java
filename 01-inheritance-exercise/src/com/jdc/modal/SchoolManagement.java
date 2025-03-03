package com.jdc.modal;

public class SchoolManagement {
	
	public static void main(String[] args) {
		
		Student s = new Student("Mery", 25, "F001", 3.8);
		Teacher t = new Teacher("Mc Kim", 20, "Java", 2);
		Person p = new Person("Wint Shwe Yee", 23);
		Person p1 = new Teacher("Ye Khaung Soe", 18, "React", 1);
		
		// Up casting
		Person p2 = s;  // implicit
		Person p3 = t;
		System.out.println("==== Upcasting Demo ====");
		p2.introduce();
		p3.introduce();
		
		// Down casting
		System.out.println("==== Down Casting ===");
		printDetail(s);
		System.out.println("---------------------");
		printDetail(t);
		
		// Wrong Down casting
		System.out.println("==== Wrong Downcasting ====");
		Person p4 = new Person("Htar Inzali", 23);
		if(p4 instanceof Student) {
			Student s1 = (Student) p4;
			s1.study();
		}else {
			System.err.println("p4 is not a student, can't downcasting.");
		}
	}
	
	
	static void printDetail(Person p) { // new Student()
		p.introduce();
			
		if(p instanceof Student) {
			Student s = (Student) p; // down casting
			System.out.println("Studnet ID :: " + s.studentId + " GPA :: " + s.gpa);
			s.study();
			
		} else if(p instanceof Teacher) {
			Teacher t = (Teacher) p;
			System.out.println("Subject :: " + t.subject + " Experience :: " + t.experience);
			t.learn();
		} else {
			System.err.println("Class Cast Exception Error.");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
