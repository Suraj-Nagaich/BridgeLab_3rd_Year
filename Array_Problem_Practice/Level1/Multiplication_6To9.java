package Array_Problem_Practice.Level1;

import java.util.Scanner;

public class Multiplication_6To9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 6 and 9: ");
        int number = sc.nextInt();
        if (number >= 6 && number <= 9) {
            System.out.println("Multiplication Table of " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        } else {
            System.out.println("Invalid input. Please enter a number between 6 and 9.");
        }

	}

}
