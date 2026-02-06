package com.staticvariables;

public class Example9 {
    
    static int methodCallCount = 0;    
    public void performTask() {
        methodCallCount++; 
        System.out.println("Task performed!");
    }
        public static void printCallCount() {
        System.out.println("The method has been called " + methodCallCount + " times.");
    }

    public static void main(String[] args) {
        
    	Example9 obj1 = new Example9();
    	Example9 obj2 = new Example9();

        
        obj1.performTask(); 
        obj1.performTask(); 
        obj2.performTask(); 
        obj2.performTask(); 
        
        
        Example9.printCallCount(); 
    }


}
