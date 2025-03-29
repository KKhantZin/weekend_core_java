package com.jdc.entity;

public class Office extends Member{
	
	protected String  department;
	
	public Office(String id, String name, String department) {
		super(id, name, "Office");
		this.department = department;
	}

	@Override
	public void login() {
		System.out.println("Office staff " + name + " logged in.");
	}
	
	@Override
	public void logout() {
		System.out.println("Office staff " + name + " logged out.");
	}
	
	@Override
	public String showDetails() {
		return "Office Staff ID : " + id + ", Name : " + name + ",Department :  " + department;
	}
	
	public String registerStudent(String studentId, String name, String grade) {
		new Student(studentId, name, grade, "Unpaid", "Not Provided");
		return "Student " + studentId + " registered by " + name;
	}
	
	public String updateBillingStatus(String studentId, String status) {
		return "Billing status for student " + studentId + " updated to " + status + " by " + name;
	}
	
	public String createNewClass(String className) {
		return "New Class " + className + " created by " + name;
	}
}
