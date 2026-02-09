package com.test;

import java.util.Scanner;

public class Department {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Staff Name :  ");
		String name = sc.nextLine();
		System.out.println("Enter Staff ID : ");
		String id=sc.nextLine();
		System.out.println("Enter Base Shift: ");
		String shift = sc.nextLine();
		System.out.println("Enter Department Name :  ");
		String departmentName = sc.nextLine();
		System.out.println("Enter Responsibility Level:  ");
		String level = sc.nextLine();
		
		DepartmentStaff staff = new DepartmentStaff(name, id, shift, departmentName, level );
		
		int choice=0;
		boolean status=true;
		while(status) {
			System.out.println("---menu----");
			System.out.println("1. Update Responsibility");
			System.out.println("2. Update Department");
			System.out.println("3. View Profile");
			System.out.println("4. Exit  \n");
			System.out.println("enter choice :");
			choice = sc.nextInt();
            sc.nextLine(); 
			switch(choice) {
			case 1:
				System.out.println("Enter new Responsibility Level");
				String newrespoLevel = sc.nextLine();
				staff.updateResponsibilityLevel(newrespoLevel);
				break;
			
			case 2:
				System.out.println("Enter new Department name");
				String newDepartment = sc.nextLine();
				staff.updateDepartment(newDepartment);
				break;
			
			case 3:
				staff.displayDetails();
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
