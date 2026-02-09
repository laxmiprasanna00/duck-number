package com.test;

public class Plan extends SubscriptionPlan{

	private String planType;
	private double planCost;
	private double paidAmount;
	public Plan(String subscriberName, String subscriptionStatus, String planType, double planCost, double paidAmount) {
		super(subscriberName, subscriptionStatus);
		this.planType = planType;
		this.planCost = planCost;
		this.paidAmount = paidAmount;
		System.out.println("The subscription is done");
		
	}
	public void updatePaidAmount(double newpaidAmount) {
		
		if(newpaidAmount <=0) {
			System.out.println("The Entered data is invaid Please Enter Valid Details");
		}
		else {
			paidAmount = newpaidAmount;
			System.out.println("updated payment sucessfully");
		}
	}
	
	public void displayDetails() {
        System.out.println("--- Subscription Summary ---");
        super.profile();
        System.out.println(" Plan Type   : " + planType);
        System.out.println(" Plan Cost  : " + planCost);
        System.out.println("Paid Amount : "+paidAmount);
        
    }
	
}
