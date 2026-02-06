package com.staticvariables;

public class Example2 {
	
	 int id;
	    String name;
	    static String schoolName = "ABC School";
Example2(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }
public void display() {
	        System.out.println("Id:"+id);
	        System.out.println("Name:"+name);
	        System.out.println("SchoolName:"+schoolName);
	    }
	    public static void main(String[] args) {
	        Example2 e1 = new Example2(1, "laxmi");
	        Example2 e2 = new Example2(2, "prasanna");
	        Example2 e3 = new Example2(3, "subu");
	        e1.display();
	        e2.display();
	        e3.display();
	    }

}
