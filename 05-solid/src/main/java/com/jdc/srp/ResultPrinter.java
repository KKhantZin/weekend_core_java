package com.jdc.srp;

public class ResultPrinter {
		// print result
		public void printResult (Student student, double average, String grade) {
			System.out.println("Student name : " + student.getName());
			System.out.println("\nMarks\n*******");
			for(int i = 0; i < student.getMarks().length; i++) {
				System.out.println("Subject " + (i + 1) + " : " + student.getMarks()[i]);
			}
			
			System.out.println("\nAverage : " + average);
			System.out.println("\nGrade : " + grade);
		}
		
		public void printResultV2 (Student student, double average, String grade) {
			System.out.println("<html><body>");
			System.out.println("<h1>Student name : " + student.getName() + "</h1>");
			System.out.println("<p>Marks : </p>");
			for(int i = 0; i < student.getMarks().length; i++) {
				System.out.println("<p>Subject " + (i + 1) + " : " + student.getMarks()[i] + "</p>");
			}
			
			System.out.println("<p>Average : " + average + "</p>");
			System.out.println("<p>Grade : " + grade + "</p>");
			System.out.println("</body></html>");
		}
		
}
