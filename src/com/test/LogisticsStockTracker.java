package com.test;

import java.util.ArrayList;
import java.util.Scanner;


class StockHandler {
    String handlerName;
    String handlerID;

    public void setHandlerDetails(String name, String id) {
        this.handlerName = name;
        this.handlerID = id;
    }
}


class StockPerformance extends StockHandler {
    ArrayList<Integer> stockQuantities = new ArrayList<>();
    int totalStockHandled = 0;
    double averageStockPerEntry = 0.0;
    String handlingGrade = "Not Evaluated";

    
    public void addStock(int quantity) {
        if (quantity <= 0) {
            System.out.println("Invalid quantity! Stock not added.");
            return;
        }
        stockQuantities.add(quantity);
        System.out.println("Stock entry added successfully.");
    }

    
    public void recalculatePerformance() {
        if (stockQuantities.isEmpty()) {
            System.out.println("No stock entries to calculate performance.");
            return;
        }

        totalStockHandled = 0;
        for (int qty : stockQuantities) {
            totalStockHandled += qty;
        }

        averageStockPerEntry = (double) totalStockHandled / stockQuantities.size();

        
        if (averageStockPerEntry >= 50) {
            handlingGrade = "Highly Efficient";
        } else if (averageStockPerEntry >= 30) {
            handlingGrade = "Efficient";
        } else if (averageStockPerEntry > 0) {
            handlingGrade = "Needs Improvement";
        } else {
            handlingGrade = "Not Evaluated";
        }

        System.out.println("Stock Performance Profile Created");
    }

    
    public void viewSummary() {
        System.out.println("\nStock Performance Summary");
        System.out.println("Handler: " + handlerName);
        System.out.println("Handler ID: " + handlerID);
        System.out.println("Total Stock Handled: " + totalStockHandled);
        System.out.println("Average Stock Per Entry: " + averageStockPerEntry);
        System.out.println("Handling Grade: " + handlingGrade);
        System.out.println();
    }
}


public class LogisticsStockTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StockPerformance handler = new StockPerformance();
 
        System.out.print("Enter Handler Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Handler ID: ");
        String id = sc.nextLine();
        handler.setHandlerDetails(name, id);

        boolean running = true;
        while (running) {
            
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Stock");
            System.out.println("2. Recalculate Result");
            System.out.println("3. View Summary");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Stock Quantity: ");
                    int qty = sc.nextInt();
                    handler.addStock(qty);
                    break;
                case 2:
                    handler.recalculatePerformance();
                    break;
                case 3:
                    handler.viewSummary();
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 1-4.");
            }
        }

        sc.close();
    }
}
