package com.test;

public class Vehicle {
	private String ownerName;
	private String vehicleNumber;
	private String vehicleType;
	public Vehicle(String ownerName, String vehicleNumber, String vehicleType) {
		
		this.ownerName = ownerName;
		this.vehicleNumber = vehicleNumber;
		this.vehicleType = vehicleType;
	}
	public void profile() {
		System.out.println("Owner Name        : " + ownerName);
        System.out.println("Vehicle Number    : " + vehicleNumber);
        System.out.println("Vehicle Type      : " + vehicleType);
	}

}
