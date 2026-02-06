package com.staticvariables;
	
	class SharedData {
	   
	    static int count = 0;
	}	
	class ClassA {
	    public void increment() {
	        SharedData.count++;
	        System.out.println("ClassA incremented count to: " + SharedData.count);
	    }
	}	
	class ClassB {
	    public void decrement() {
	        SharedData.count--;
	        System.out.println("ClassB decremented count to: " + SharedData.count);
	    }
	}

	public class Example10 {
	
	    public static void main(String[] args) {
	        ClassA objA1 = new ClassA();
	        ClassA objA2 = new ClassA();
	        ClassB objB1 = new ClassB();	       
	        objA1.increment(); 
	        objA2.increment(); 
	        objB1.decrement(); 

	        
	        System.out.println("Final count (from SharedData): " + SharedData.count); 
	    }
	}



