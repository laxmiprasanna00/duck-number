package com.test;

public class PerformanceEmployee extends SalesEmployee{
	private int salesCount  ;
	private int totalSales;
	private double averageSales;
	private String performanceGrade;
	
	
	
public PerformanceEmployee(String employeeName, int employeeID, int totalSales) {
		super(employeeName, employeeID);
		
		this.totalSales = totalSales;
		
		System.out.println("the profile is generated");
	}
public void addSalesEntry(double amount) {
		
		if( amount <= 0) {
			System.out.println("The Entered data is invaid Please Enter Valid Details");
		}
		else {
			totalSales += amount;
	        salesCount++;
	        System.out.println("Sales entry added successfully");
		}
	}
	public void calculatePerformance() {
		
		 if (salesCount == 0) {
	            System.out.println("No sales data available.");
	            return;
	        }

	        averageSales = totalSales / salesCount;

	        if (averageSales >= 15000) {
	            performanceGrade = "Excellent";
	        } else if (averageSales >= 10000) {
	            performanceGrade = "Good";
	        } else {
	            performanceGrade = "Needs Improvement";
	        }

	        System.out.println(" Performance Profile Created");
	    }
	
	public void displayDetails() {
		System.out.println("Performance Summary");
        super.profile();
        System.out.println("Total Sales: " + totalSales);
        System.out.println("Average Sales: " + averageSales);
        System.out.println("Performance Grade: " + performanceGrade);
    }

	
	
}
