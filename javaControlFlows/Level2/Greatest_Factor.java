package java_control_flows.Level2;

import java.util.Scanner;

public class Greatest_Factor {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a positive integer: ");
	        int number = sc.nextInt();
	        if (number <= 1) {
	            System.out.println("No proper factor exists for " + number);
	        } else {
	            int i = number - 1;
	            while (i > 0) {
	                if (number % i == 0) {
	                    System.out.println("Greatest factor of " + number + " (excluding itself) is: " + i);
	                    break; 
	                }
	                i--;
	            }
	        }
	}

}
