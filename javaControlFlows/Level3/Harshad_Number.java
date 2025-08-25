package java_control_flows.Level3;

import java.util.Scanner;

public class Harshad_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int sumOfDigits = 0;
        while (num > 0) {
            sumOfDigits += num % 10;
            num /= 10;
        }
        if (sumOfDigits != 0 && originalNum % sumOfDigits == 0) {
            System.out.println(originalNum + " is a Harshad Number.");
        } else {
            System.out.println(originalNum + " is not a Harshad Number.");
        }
	}

}
