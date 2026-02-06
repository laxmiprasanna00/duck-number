package com.staticvariables;

public class Example8 {
		    
	    static int staticCount = 0;	    
	    int nonStaticCount = 0;	    
	    public void increment() {
	        staticCount++;
	        nonStaticCount++;
	    }	    
	    public void decrement() {
	        staticCount--;
	        nonStaticCount--;
	    }	    
	    public void printCounts() {
	        System.out.println("Static Count: " + staticCount);
	        System.out.println("Non-Static Count: " + nonStaticCount);
	        System.out.println("---------------------------");
	    }

	    public static void main(String[] args) {
	        
	    	Example8 c1 = new Example8();
	    	Example8 c2 = new Example8();
	        c1.increment();
	        c1.increment();
	        c1.printCounts(); 
	        c2.increment();
	        c2.decrement();
	        c2.printCounts();
	        c1.decrement();
	        c1.printCounts(); 
	        c2.printCounts();
	    }
	}



