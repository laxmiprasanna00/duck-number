package com.test;

public class SubscriptionPlan {
	private String subscriberName;
	
	private String subscriptionStatus;
	public SubscriptionPlan(String subscriberName, String subscriptionStatus) {
		this.subscriberName=subscriberName;
		this.subscriptionStatus=subscriptionStatus;
	}
	public void updateSubscriptionStatus(String newsubscriptionStatus) {
		
		if(newsubscriptionStatus == null || newsubscriptionStatus.equals(" ")) {
			System.out.println("The Entered data is invaid Please Enter Valid Details");
		}
		else {
			subscriptionStatus = newsubscriptionStatus;
			System.out.println("updated Category sucessfully");
		}
	}
	
	public void profile() {
		System.out.println("Subscriber Name        : " + subscriberName);
        System.out.println("Subscription Status    : " + subscriptionStatus);
       
	}
	
	}
