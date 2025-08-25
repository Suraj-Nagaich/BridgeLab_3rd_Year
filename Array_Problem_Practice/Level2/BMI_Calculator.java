package Array_Problem_Practice.Level2;

import java.util.Scanner;

public class BMI_Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[] heights = new double[n];
        double[] weights = new double[n];
        double[] bmis = new double[n];
        String[] statuses = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter height (in meters) for person " + (i + 1) + ":");
            heights[i] = sc.nextDouble();
            System.out.println("Enter weight (in kg) for person " + (i + 1) + ":");
            weights[i] = sc.nextDouble();
            bmis[i] = weights[i] / (heights[i] * heights[i]);
            if (bmis[i] < 18.5) statuses[i] = "Underweight";
            else if (bmis[i] < 25) statuses[i] = "Normal weight";
            else if (bmis[i] < 30) statuses[i] = "Overweight";
            else statuses[i] = "Obesity";
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%s\n", heights[i], weights[i], bmis[i], statuses[i]);
        }

	}

}
