package Array_Problem_Practice.Level1;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input. Please enter a number greater than 0.");
        }
        String[] fizzBuzzArray = new String[n];
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzArray[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                fizzBuzzArray[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                fizzBuzzArray[i - 1] = "Buzz";
            } else {
                fizzBuzzArray[i - 1] = String.valueOf(i);
            }
        }
        System.out.println("FizzBuzz Results:");
        for (int i = 0; i < n; i++) {
            System.out.println("Position " + (i + 1) + " = " + fizzBuzzArray[i]);
        }
	}

}
