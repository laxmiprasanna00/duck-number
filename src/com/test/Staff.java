package com.test;

public class Staff {
	private String staffName;
	private String staffID;
	private String baseShift;
	public Staff(String staffName, String staffID, String baseShift) {
		
		this.staffName = staffName;
		this.staffID = staffID;
		this.baseShift = baseShift;
	}
	public void profile() {
		System.out.println("Staff Name        : " + staffName);
        System.out.println("Staff ID    : " + staffID);
        System.out.println("base Shift      : " + baseShift);
	}
	

}
