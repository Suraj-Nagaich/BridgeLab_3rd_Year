package java_control_flows.Level3;

import java.util.Scanner;

public class Abundant_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sumOfDivisors = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sumOfDivisors += i;
            }
        }
        if (sumOfDivisors > num) {
            System.out.println(num + " is an Abundant Number.");
        } else {
            System.out.println(num + " is not an Abundant Number.");
        }
	}

}
