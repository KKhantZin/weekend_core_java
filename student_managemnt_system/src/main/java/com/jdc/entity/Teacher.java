package com.jdc.entity;

public class Teacher extends Member{
	private String subject;
	private String assignedCourse;
	private int expYear;
	
	public Teacher(String id, String name, String subject, String assignedCourse, int expYear) {
		super(id, name, "Teacher");
		this.subject = subject;
		this.assignedCourse = assignedCourse;
		this.expYear = expYear;
	}
	
	@Override
	public void login() {
		System.out.println("Teacher " + name + " logged in.");
	}

	@Override
	public void logout() {
		System.out.println("Teacher " + name + " logged out.");
	}

	@Override
	public String showDetails() {
		return "Teacher ID : " + id + ", Name : " + name + ", Subject : " + subject + ", Assigned Course : " + 
				assignedCourse + ", Experience Year : " + expYear;
	}
	
	public String createCourse(String newCourseName) {
		this.assignedCourse = newCourseName;
		return "Course -> " + newCourseName + " created by " + name;
	}
	
	public String manageAttendance(String studentId) {
		return "Attendance for student " + studentId + " managed by " + name;
	}
	
	public String manageStudentProgress(String studentId) {
		return "Progress for student " + studentId + " updated by " + name;
	}

}
