package java_control_flows.Level2;

import java.util.Scanner;

public class Multiple_100 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a positive integer: ");
	        int number = sc.nextInt();
	        if (number <= 0) {
	            System.out.println("Please enter a positive integer greater than 0.");
	        } else {
	            System.out.println("Multiples of " + number + " below 100:");

	            int multiple = number;
	            while (multiple < 100) {
	                System.out.print(multiple + " ");
	                multiple += number;
	            }
	        }

	}

}
