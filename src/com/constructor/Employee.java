package com.constructor;

public class Employee {
	private int empId;
	private String empName;
	private String Designation;
	private double salary;
	private int rating;
	public Employee(int empId, String empName, String Designation, double salary, int rating) {
		this.empId=empId;
		this.empName=empName;
		this.Designation=Designation;
		this.salary=salary;
		this.rating=rating;
	}
	public int getempId() {
		return empId;
	}
	public String getempName() {
		return empName;
	}
	public String getDesignation() {
		return Designation;
	}
	public double getsalary() {
		return salary;
	}
	public int getrating() {
		return rating;
	}
	public void setempId(int empId) {
		this.empId=empId;
	}
	
	public void setempName(String empName) {
		this.empName=empName;
	}
	public void setDesignation(String Designation) {
		this.Designation=Designation;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
	public void setrating(int rating) {
		this.rating=rating;
	}
	public void promoteEmployee(String newDesignation) {
		if(rating>=4) {
			salary+=(salary*0.2);
			Designation=newDesignation;
			System.out.println("SALARY HIKED AND PROMOTED TO NEXT LEVEL");
		}
		else {
			System.out.println("NO PROMOTION");
		}
	}

}
