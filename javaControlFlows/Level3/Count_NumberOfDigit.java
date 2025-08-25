package java_control_flows.Level3;

import java.util.Scanner;

public class Count_NumberOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        num = Math.abs(num);
        int count = 0;
        if (num == 0) {
            count = 1;
        } else {
            while (num > 0) {
                num /= 10;
                count++;
            }
        }
        System.out.println("Number of digits: " + count);
	}

}
