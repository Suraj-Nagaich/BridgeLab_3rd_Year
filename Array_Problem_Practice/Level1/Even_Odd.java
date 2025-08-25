package Array_Problem_Practice.Level1;
import java.util.*;
public class Even_Odd {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int[] numbers = new int[5];
	        System.out.println("Enter 5 numbers:");
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Number " + (i + 1) + ": ");
	            numbers[i] = sc.nextInt();
	        }
	        System.out.println("\n--- Number Analysis ---");
	        for (int i = 0; i < 5; i++) {
	            int num = numbers[i];
	            System.out.print("Number " + (i + 1) + " (" + num + "): ");

	            if (num > 0) {
	                System.out.print("Positive, ");
	                if (num % 2 == 0) {
	                    System.out.println("Even");
	                } else {
	                    System.out.println("Odd");
	                }
	            } else if (num < 0) {
	                System.out.println("Negative");
	            } else {
	                System.out.println("Zero");
	            }
	        }
	        System.out.println("Comparison of First and Last Numbers");
	        int first = numbers[0];
	        int last = numbers[4];
	        System.out.println("First number: " + first);
	        System.out.println("Last number: " + last);
	        if (first == last) {
	            System.out.println("Result: First and last numbers are equal.");
	        } else if (first > last) {
	            System.out.println("Result: First number is greater than the last number.");
	        } else {
	            System.out.println("Result: First number is less than the last number.");
	        }

	}

}
