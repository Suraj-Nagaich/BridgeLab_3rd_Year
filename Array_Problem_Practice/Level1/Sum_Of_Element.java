package Array_Problem_Practice.Level1;

import java.util.Scanner;

public class Sum_Of_Element {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int[] numbers = new int[10];
	        int sum = 0;
	        int count = 0;
	        System.out.println("Enter up to 10 positive numbers");
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Enter number " + (i + 1) + ": ");
	            int input = sc.nextInt();
	            if (input <= 0) {
	                break; 
	            }
	            numbers[i] = input;
	            sum += input;
	            count++;
	        }
	        System.out.println("You entered the following numbers:");
	        for (int i = 0; i < count; i++) {
	            System.out.print(numbers[i] + " ");
	        }
	        System.out.println("Sum of all numbers: " + sum);

	}

}
