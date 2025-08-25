package java_control_flows.Level1;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the start of the range: ");
	        int start = scanner.nextInt();
	        System.out.print("Enter the end of the range: ");
	        int end = scanner.nextInt();
	        System.out.println("Even numbers in the range:");
	        for (int i = start; i <= end; i++) {
	            if (i % 2 == 0) {
	                System.out.print(i + " ");
	            }
	        }
	        System.out.println("\nOdd numbers in the range:");
	        for (int i = start; i <= end; i++) {
	            if (i % 2 != 0) {
	                System.out.print(i + " ");
	            }
	        }
	    }
	}