package com.test;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Employee ID : ");
        int empId = sc.nextInt();
        System.out.println("Enter total salaes : ");
        int totalSales = sc.nextInt();
        PerformanceEmployee emp = new PerformanceEmployee(name, empId, totalSales );
        

	}
	

}
