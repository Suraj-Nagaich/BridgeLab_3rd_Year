package Array_Problem_Practice.Level2;

import java.util.Scanner;

public class Second_Largest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input = sc.nextLine();
        int[] digits = new int[input.length()];
        for (int i = 0; i < input.length(); i++) digits[i] = input.charAt(i) - '0';
        int largest = -1, secondLargest = -1;
        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        System.out.println("Largest digit: " + largest);
        System.out.println(secondLargest == -1 ? "No second largest digit" : "Second largest digit: " + secondLargest);
	}

}
