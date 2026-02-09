package com.test;

public class SalesEmployee {
	private String employeeName;
	private int employeeID;
	public SalesEmployee(String employeeName, int employeeID) {
		
		this.employeeName = employeeName;
		this.employeeID = employeeID;
	}
	public void profile() {
		System.out.println("Employee Name        : " + employeeName);
        System.out.println("Employee ID    : " + employeeID);
        
	}


}
