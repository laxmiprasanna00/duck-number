package com.test;

public class DepartmentStaff extends Staff{
	private String departmentName;
	private String responsibilityLevel;
	public DepartmentStaff(String staffName, String staffID, String baseShift, String departmentName,
			String responsibilityLevel) {
		super(staffName, staffID, baseShift);
		this.departmentName = departmentName;
		this.responsibilityLevel = responsibilityLevel;
		System.out.println("the staff profile has been created");
		
	}
	public void updateResponsibilityLevel(String newrespoLevel) {
		
		if(newrespoLevel == null || newrespoLevel.equals(" ")) {
			System.out.println("The Entered data is invaid Please Enter Valid Details");
		}
		else {
			responsibilityLevel = newrespoLevel;
			System.out.println("updated sucessfully");
		}
	}
	public void updateDepartment(String newDepartment) {
		
		if(newDepartment == null || newDepartment.equals(" ")) {
			System.out.println("The Entered data is invaid Please Enter Valid Details");
		}
		else {
			departmentName = newDepartment;
			System.out.println("updated sucessfully");
		}
	}
	public void displayDetails() {
        System.out.println("--- Staff Details ---");
        super.profile();
        System.out.println(" Responsibility Level   : " + responsibilityLevel);
        System.out.println("Department Name  : " + departmentName);
    }
	
}
