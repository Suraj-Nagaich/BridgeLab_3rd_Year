package Array_Problem_Practice.Level1;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number to find its factors: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive number.");
        }
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
	}

}
