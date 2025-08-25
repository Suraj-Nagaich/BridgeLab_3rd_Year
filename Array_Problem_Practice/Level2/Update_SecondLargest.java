package Array_Problem_Practice.Level2;
import java.util.*;
public class Update_SecondLargest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter digits separated by space:");
        String[] input = sc.nextLine().split(" ");
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        for (String s : input) {
            if (index == maxDigit) {
                maxDigit += 10;
                digits = Arrays.copyOf(digits, maxDigit);
            }
            digits[index++] = Integer.parseInt(s);
        }
        digits = Arrays.copyOf(digits, index);
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
