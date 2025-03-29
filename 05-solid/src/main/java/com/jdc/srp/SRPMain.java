package com.jdc.srp;

public class SRPMain {
	public static void main(String[] args) {
		int [] marks = {85, 90, 78, 92};
		
		Student s1 = new Student("Tun Naing Soe", marks);
		
//		s1.printResult();
//		s1.saveResultToFile();
		
		GradeCalculator cal = new GradeCalculator();
		Storage store = new Storage();
		ResultPrinter print = new ResultPrinter();
		
		double average = cal.calculateAverage(s1);
		String grade = cal.calculateGrade(s1);
		
		print.printResultV2(s1, average, grade);
		store.saveResultToDatabase(s1, average, grade);
	}
}
