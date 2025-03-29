package com.jdc.entity;

public class StudentManagementSystemApp {
	public static void main(String[] args) {
		
		// Create instance(object) of each class
		Student s1 = new Student("S001", "Peter Paker", "10th", "Paid", "Address : England");
		Student s2 = new Student("S002", "Mery James", "5th", "Unpaid", "Adress : England");
		
		Teacher t1 = new Teacher("T001", "George", "Science", "Unit 5", 5);
		
		Office off = new Office("0001", "Thomas", "HR");
		
		Manager man = new Manager("M001", "Chris", "IT");
		
		Admin admin = new Admin("A001", "Jhonson", "Super");
		
		Anonymous ano = new Anonymous("Ano123");
		
		// Testing Student
		s1.login();
		System.out.println(s1.showDetails());
		System.out.println(s1.accessClassInfo());
		System.out.println(s1.accessBillingStatus());
		System.out.println(s1.accessPersonalInfo());
		System.out.println(s1.searchStudent("S001"));
		System.out.println(s1.accessPublicInfo());
		s1.logout();
		
		System.out.println("=======================================================");
		
		
		
		
		
		
	}
}
