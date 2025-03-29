package com.jdc.entity;

// concrete class extends concrete class
public class Manager extends Office{
	private String financeRecord;
	
	public Manager(String id, String name, String department) {
		super(id, name, department);
		this.role = "Manager";
		this.financeRecord = "None";
	}

	@Override
	public void login() {
		System.out.println("Manager " + name + " logged in.");
	}

	@Override
	public void logout() {
		System.out.println("Manager " + name + " logged out.");
	}

	@Override
	public String showDetails() {
		return "Manager Id : " + id + ", Name : " + name + ", Department : " +  department;
	}
	
	public String manageBudget(String budgetInfo) {
		return "Budget " + budgetInfo + " managed by " + name;
	}
	
	public String manageFinacialRecords(String record) {
		this.financeRecord = record;
		return "Finacial record " + record + " updated by  " + name;
	}
	
	public String viewFinalcialRecord() {
		return "Last finacial record viewd by " + name + " : " + financeRecord;
	}
	
}
