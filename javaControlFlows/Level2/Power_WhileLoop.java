package java_control_flows.Level2;

import java.util.Scanner;

public class Power_WhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent (non-negative integer): ");
        int exponent = sc.nextInt();
        if (exponent < 0) {
            System.out.println("Exponent should be a non-negative integer.");
        } else {
            int result = 1;
            int count = 0;
            while (count < exponent) {
                result *= base;
                count++;
            }

            System.out.println(base + " raised to the power " + exponent + " is: " + result);
        }
	}

}
