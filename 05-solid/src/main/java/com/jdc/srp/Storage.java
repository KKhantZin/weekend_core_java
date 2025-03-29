package com.jdc.srp;

public class Storage {

	// save result to file
	public void saveResultToFile(Student student, double average, String grade) {
		System.out.println("\nSaving result for " + student.getName() + " : Average = " 
					 	   + average + ", Grade " + grade + " to File.");
	}
	
	// save result to database
		public void saveResultToDatabase(Student student, double average, String grade) {
			System.out.println("\nSaving result for " + student.getName() + " : Average = " 
							   + average + ", Grade " + grade + " to Database.");
		}
}
