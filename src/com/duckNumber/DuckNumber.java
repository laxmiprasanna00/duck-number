package com.duckNumber;

import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.next();

        if (num.charAt(0) == '0') {
            System.out.println("Not a Duck Number");
            return;
        }

        if (num.contains("0")) {
            System.out.println("Duck Number");
        } else {
            System.out.println("Not a Duck Number");
        }
        sc.close();
    }
}

