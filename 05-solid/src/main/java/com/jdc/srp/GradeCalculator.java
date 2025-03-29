package com.jdc.srp;

public class GradeCalculator {

	// calculate average marks
	public double calculateAverage(Student student) {
		int total = 0;

		for (int mark : student.getMarks()) {
			total += mark;
		}
		return total;
	}

	// calculate grade
	public String calculateGrade(Student student) {
		double average = calculateAverage(student);
		if (average >= 80)
			return "A";
		else if (average >= 60)
			return "B";
		else if (average >= 40)
			return "C";
		else
			return "F";
	}

}
