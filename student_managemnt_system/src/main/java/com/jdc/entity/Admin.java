package com.jdc.entity;

public class Admin extends Member{
	
	private String accessLevel;
	private String lastLog;
	
	public Admin(String id, String name, String accessLevel) {
		super(id, name, "Admin");
		this.accessLevel = accessLevel;
		this.lastLog = lastLog;
	}

	@Override
	public void login() {
		System.out.println("Admin " + name + " logged in.");
	}

	@Override
	public void logout() {
		System.out.println("Admin " + name + " logged out.");
	}

	@Override
	public String showDetails() {
		return "Admin Id : " + id + ", Name : " + name + ", Access Level : " + accessLevel;
	}
	
	public String manageMasterData(String data) {
		return "Master data " + data + " managed by " + name;
	}
	
	public String configureSite(String config) {
		return "Site Confinguration " + config + " updated by " + name;
	}
	
	public String manageLog(String log) {
		this.lastLog = log;
		return "Log " + log + " managed by " + name;
	}
	
	public String viewLastLog() {
		return "Last log viewed by " + name + " " + lastLog;
	}
	
}
