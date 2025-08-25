package Array_Problem_Practice.Level2;

import java.util.Scanner;

public class Height_Comparison {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextDouble();
        }
        int minAgeIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
        }
        int maxHeightIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }
        System.out.println("\nYoungest friend: " + names[minAgeIndex] + " (Age: " + ages[minAgeIndex] + ")");
        System.out.println("Tallest friend: " + names[maxHeightIndex] + " (Height: " + heights[maxHeightIndex] + " cm)");

	}

}
