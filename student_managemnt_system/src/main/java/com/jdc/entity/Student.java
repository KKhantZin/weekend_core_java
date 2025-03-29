package com.jdc.entity;

public class Student extends Member{
	private String grade;
	private String billingStatus;
	private String pesonalInfo;
	
	private static Student[] studentList = new Student[10];
	private static int studentCount = 0;
	
	public Student(String id, String name, String grade, String billStatus, String personalInfo) {
		super(id, name, "Student"); // id, name, role = "Student"
		
		this.grade = grade;
		this.billingStatus = billStatus;
		this.pesonalInfo = personalInfo;
		
		studentList[studentCount]  = this; // add to array
		studentCount ++;
	}

	@Override
	public void login() {
		System.out.println("Student  " + name + " logged in.");
	}

	@Override
	public void logout() {
		System.out.println("Student " + name + " logged out.");
	}

	@Override
	public String showDetails() {
		return "Student ID : " + id + ", Name : " + name + ", Grade : " + grade;
	}
	
	public String accessClassInfo() {
		return "Class info for " + name + ": Grade " + grade;
	}
	
	public String accessBillingStatus() {
		return "Billing status for " + name + " : " + billingStatus;
	}
	
	public String accessPersonalInfo() {
		return "Personal info for " + name + " : " + pesonalInfo; 
	}
	
	public static String searchStudent(String studentId) {
		for(int i = 0; i< studentCount; i++) {
			if(studentList[i].id.equals(studentId) ) {
				return studentList[i].showDetails();
			}
		}
		
		return "Student with ID " + studentId + " not found.";
	}
	
}
