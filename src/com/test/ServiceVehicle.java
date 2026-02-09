package com.test;

public class ServiceVehicle extends Vehicle{
	private String serviceCenterName;
	private String serviceCategory;
	public ServiceVehicle(String ownerName, String vehicleNumber, String vehicleType, String serviceCenterName,
			String serviceCategory) {
		super(ownerName, vehicleNumber, vehicleType);
		this.serviceCenterName = serviceCenterName;
		this.serviceCategory = serviceCategory;
		System.out.println("the vehicle profile has been created");
	}
	
	public void updateServiceCenter(String newCenterName) {
		
		if(newCenterName == null || newCenterName.equals(" ")) {
			System.out.println("The Entered data is invaid Please Enter Valid Details");
		}
		else {
			serviceCenterName = newCenterName;
			System.out.println("updated center name sucessfully");
		}
	}
	public void updateServiceCategory(String newCategory) {
		
		if(newCategory == null || newCategory.equals(" ")) {
			System.out.println("The Entered data is invaid Please Enter Valid Details");
		}
		else {
			serviceCategory = newCategory;
			System.out.println("updated Category sucessfully");
		}
	}
	public void displayDetails() {
        System.out.println("--- Vehicle Profile Details ---");
        super.profile();
        System.out.println("Service Center    : " + serviceCenterName);
        System.out.println("Service Category  : " + serviceCategory);
    }

}
