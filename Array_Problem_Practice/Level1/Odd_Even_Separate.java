package Array_Problem_Practice.Level1;

import java.util.Scanner;

public class Odd_Even_Separate {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a positive number: ");
	        int n = sc.nextInt();
	        if (n < 1) {
	            System.out.println("Please enter a number greater than 0.");
	        }
	        int[] oddNumbers = new int[n];
	        int[] evenNumbers = new int[n];
	        int oddIndex = 0, evenIndex = 0;
	        for (int i = 1; i <= n; i++) {
	            if (i % 2 == 0) {
	                evenNumbers[evenIndex++] = i;
	            } else {
	                oddNumbers[oddIndex++] = i;
	            }
	        }
	        System.out.println("Odd Numbers:");
	        for (int i = 0; i < oddIndex; i++) {
	            System.out.print(oddNumbers[i] + " ");
	        }
	        System.out.println("Even Numbers:");
	        for (int i = 0; i < evenIndex; i++) {
	            System.out.print(evenNumbers[i] + " ");
	        }
	}

}
