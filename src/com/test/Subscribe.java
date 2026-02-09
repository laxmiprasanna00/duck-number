package com.test;

import java.util.Scanner;

public class Subscribe {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);

		
		System.out.println("Enter Subscriber Name : ");
		String subscriberName = sc.nextLine();
		System.out.println("Enter Plan Type : ");
		String planType=sc.nextLine();
		System.out.println("Enter Plan Cost : ");
		double planCost = sc.nextDouble();
		System.out.println("Enter Paid Amount : ");
		double paidAmount = sc.nextDouble();
		System.out.println("Enter Subscription Status : ");
		String subscriptionStatus = sc.next();
		
		Plan obj = new Plan(subscriberName, subscriptionStatus, planType, planCost, paidAmount);
		int choice=0;
		boolean status=true;
		while(status) {
			System.out.println("---menu----");
			System.out.println("1. Update Paid Amount");
			System.out.println("2. Change Subscription Status");
			System.out.println("3. View Subscription Summary");
			System.out.println("4. Exit the program \n");
			System.out.println("enter choice :");
			choice = sc.nextInt();
            sc.nextLine(); 
			switch(choice) {
			case 1:
				System.out.println("Update Payment");
				double newpaidAmount = sc.nextDouble();
				obj.updatePaidAmount(newpaidAmount);
				break;
			
			case 2:
				System.out.println("Change Subscription Status: (active|inactive)");
				String newsubscriptionStatus = sc.nextLine();
				obj.updateSubscriptionStatus(newsubscriptionStatus);
				break;
			
			case 3:
				obj.displayDetails();
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
