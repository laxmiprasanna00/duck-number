package com.constructor;

public class Employeeprocessor {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101,"prasanna","Junior Devloper", 30000, 5);
		System.out.println("emp id : "+emp1.getempId());
		System.out.println("emp Name : "+emp1.getempName());
		System.out.println("emp designation: "+emp1.getDesignation());
		System.out.println("emp salary : "+emp1.getsalary());
		System.out.println("emp rating : "+emp1.getrating());
		emp1.promoteEmployee("Senior Developer");
		System.out.println("=================updated vaues===============");
		System.out.println("emp salary : "+emp1.getsalary());
		System.out.println("emp designation: "+emp1.getDesignation());

	}

}
