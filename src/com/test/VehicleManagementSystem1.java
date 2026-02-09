package com.test;

import java.util.Scanner;



public class VehicleManagementSystem1 {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Owner Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Vehicle Number : ");
		String number=sc.nextLine();
		System.out.println("Enter Vehicle Type : ");
		String type = sc.nextLine();
		System.out.println("Enter Service Center Nmae : ");
		String centerName = sc.nextLine();
		System.out.println("Enter Service Category : ");
		String category = sc.nextLine();
		
		ServiceVehicle sv = new ServiceVehicle(name, number, type, centerName, category);
		
		
		int choice=0;
		boolean status=true;
		while(status) {
			System.out.println("---menu----");
			System.out.println("1. Update Service Category");
			System.out.println("2. Update Service Center Name");
			System.out.println("3. View Vehicle Profile Details");
			System.out.println("4. Exit  \n");
			System.out.println("enter choice :");
			choice = sc.nextInt();
            sc.nextLine(); 
			switch(choice) {
			case 1:
				System.out.println("Enter new service category");
				String newCategory = sc.nextLine();
				sv.updateServiceCategory(newCategory);
				break;
			
			case 2:
				System.out.println("Enter new service center name");
				String newCenterName = sc.nextLine();
				sv.updateServiceCategory(newCenterName);
				break;
			
			case 3:
				sv.displayDetails();
				break;
			
			case 4 :
				System.out.println("Thank you");
				status=false;
			
			default:
                System.out.println("Invalid choice. Please try again.");
			}
			
		}
		
		
		
		
		sc.close();


	}

}
