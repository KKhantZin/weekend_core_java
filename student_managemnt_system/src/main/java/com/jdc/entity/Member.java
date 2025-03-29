package com.jdc.entity;

public abstract class Member {
	protected String id;
	protected String name;
	protected String role;
	
	public Member(String id, String name, String role) {
		this.id = id;
		this.name = name;
		this.role = role;
	}
	
	public abstract void login();
	public abstract void logout();
	public abstract String showDetails();
	
	// to access public information
	public String accessPublicInfo() {
		return "Public information accessed by  " + role + " " + name;
	}
}
