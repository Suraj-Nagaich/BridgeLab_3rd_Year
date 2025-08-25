package Array_Problem_Practice.Level2;

import java.util.Scanner;

public class Grades_On_Subject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        double[] percentages = new double[n];
        char[] grades = new char[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + " (Physics, Chemistry, Maths):");
            double physics = sc.nextDouble();
            double chemistry = sc.nextDouble();
            double maths = sc.nextDouble();
            double total = physics + chemistry + maths;
            double percentage = (total / 300) * 100;
            percentages[i] = percentage;
            if (percentage >= 90) grades[i] = 'A';
            else if (percentage >= 80) grades[i] = 'B';
            else if (percentage >= 70) grades[i] = 'C';
            else if (percentage >= 60) grades[i] = 'D';
            else grades[i] = 'F';
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.2f%%\t\t%c\n", (i + 1), percentages[i], grades[i]);
        }

	}

}
