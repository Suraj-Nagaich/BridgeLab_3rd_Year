package java_control_flows.Level3;

import java.util.Scanner;

public class Calculator_SwitchCase {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	        double num1 = sc.nextDouble();
	        System.out.print("Enter second number: ");
	        double num2 = sc.nextDouble();
	        System.out.println("Choose an operation:");
	        System.out.println("1 - Addition (+)");
	        System.out.println("2 - Subtraction (-)");
	        System.out.println("3 - Multiplication (*)");
	        System.out.println("4 - Division (/)");
	        System.out.print("Enter your choice (1-4): ");
	        int choice = sc.nextInt();
	        double result;
	        switch (choice) {
	            case 1: 
	                result = num1 + num2;
	                System.out.println("Result: " + result);
	                break;
	            case 2: 
	                result = num1 - num2;
	                System.out.println("Result: " + result);
	                break;
	            case 3: 
	                result = num1 * num2;
	                System.out.println("Result: " + result);
	                break;
	            case 4: 
	                if (num2 == 0) {
	                    System.out.println("Error: Division by zero is not allowed.");
	                } else {
	                    result = num1 / num2;
	                    System.out.println("Result: " + result);
	                }
	                break;
	            default:
	                System.out.println("Invalid choice! Please enter a number between 1 and 4.");
	                break;
	        }

	}

}
