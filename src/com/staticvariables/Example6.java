package com.staticvariables;

public class Example6{
	    
	    static String company = "Amazon";
	    	    public static void setCompany(String newCompany) {
	        company = newCompany;
	    }	   
	    public static void printCompany() {
	        System.out.println("Company Name: " + company);
	    }
	    public static void main(String[] args) {
	    	Example6.printCompany();  	       
	    	Example6.setCompany("10000coders");	        
	    	Example6.printCompany(); 
	    }
}

