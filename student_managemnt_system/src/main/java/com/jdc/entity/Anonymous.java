package com.jdc.entity;

import java.util.Date;

public class Anonymous {
	
	private String id;
	private Date date;
	
	public Anonymous(String id) {
		this.id = id;
		date = new Date();
	}
	
	public String accessPublicInfo() {
		return "Public info accessed by Anonymous user with id " + id + "current date : " + date.getTime();
	}
	
	public String askQuestion(String question) {
		return "Question " + question + " asked by Anonymous user with id " + id; 
	}
	
	public String getId() {
		return "Anonymous Id : " + id;
	}
	
}
