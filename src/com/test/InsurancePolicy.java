package com.test;

import java.util.Scanner;

public class InsurancePolicy {
String customerName;
String policyType;
double policyAmount;
double approvedAmount;
String policyStatus;

public InsurancePolicy() {
	
}

public InsurancePolicy(String customerName, String policyType, double policyAmount, double approvedAmount,
		String policyStatus) {
	super();
	this.customerName = customerName;
	this.policyType = policyType;
	this.policyAmount = policyAmount;
	this.approvedAmount = approvedAmount;
	this.policyStatus = policyStatus;
	
	System.out.println("the policy record has been created");
}
public void updateApprovedAmount(double newApprovedAmount) {
	
	if(newApprovedAmount <= 0 ) {
		System.out.println("The Entered data is invaid Please Enter Valid Details");
	}
	else {
		approvedAmount = newApprovedAmount;
		System.out.println("updated sucessfully");
	}
}
public void updatePolicyStatus(String newPolicyStatus) {
	
	if(newPolicyStatus == null || newPolicyStatus.equals(" ")) {
		System.out.println("The Entered data is invaid Please Enter Valid Details");
	}
	else {
		policyStatus = newPolicyStatus;
		System.out.println("updated sucessfully");
	}
}
public void displayDetails() {
    System.out.println("--- View Policy Summary ---");
    System.out.println("Customer Name : "+customerName);
    System.out.println("Policy Type : "+policyType);
    System.out.println("Policy Amount : "+policyAmount);
    System.out.println("Approved Amount  : " + approvedAmount);
    System.out.println("Policy Status  : " + policyStatus);
}
public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Customer Name : ");
	String name = sc.nextLine();
	System.out.println("Enter Policy Type : ");
	String type=sc.nextLine();
	System.out.println("Enter Policy Amount : ");
	double amount = sc.nextDouble();
	System.out.println("Enter Approved Amount : ");
	double appAmount = sc.nextDouble();
	System.out.println("Enter Policy Status : ");
	String status = sc.next();
	
	InsurancePolicy policy = new InsurancePolicy(name, type, amount, appAmount, status);
	
	
	int choice=0;
	boolean sts=true;
	while(sts) {
		System.out.println("---menu----");
		System.out.println("1. Update Approved Amount");
		System.out.println("2. Change Policy Status");
		System.out.println("3. View Policy Summary");
		System.out.println("4. Exit the program  \n");
		System.out.println("enter choice :");
		choice = sc.nextInt();
        sc.nextLine(); 
		switch(choice) {
		case 1:
			System.out.println("Enter new Approved Amount ");
			double newApprovedAmount = sc.nextDouble();
			policy.updateApprovedAmount(newApprovedAmount);
			break;
		
		case 2:
			System.out.println("Enter new Policy Status");
			String newPolicyStatus = sc.nextLine();
			policy.updatePolicyStatus(newPolicyStatus);
			break;
		
		case 3:
			policy.displayDetails();
			break;
		
		case 4 :
			System.out.println("Thank you");
			sts=false;
		
		default:
            System.out.println("Invalid choice. Please try again.");
		}
		
	}
		
	sc.close();

}

}


