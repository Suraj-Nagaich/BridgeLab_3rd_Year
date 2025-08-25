package java_control_flows.Level3;

import java.util.Scanner;

public class Grade_Of_Pcm {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter marks for Physics: ");
	        double physics = sc.nextDouble();
	        System.out.print("Enter marks for Chemistry: ");
	        double chemistry = sc.nextDouble();
	        System.out.print("Enter marks for Maths: ");
	        double maths = sc.nextDouble();
	        double average = (physics + chemistry + maths) / 3;
	        String grade;
	        String remarks;
	        if (average >= 90) {
	            grade = "A+";
	            remarks = "Excellent";
	        } else if (average >= 80) {
	            grade = "A";
	            remarks = "Very Good";
	        } else if (average >= 70) {
	            grade = "B";
	            remarks = "Good";
	        } else if (average >= 60) {
	            grade = "C";
	            remarks = "Average";
	        } else if (average >= 50) {
	            grade = "D";
	            remarks = "Below Average";
	        } else {
	            grade = "F";
	            remarks = "Fail";
	        }
	        System.out.printf("Average Mark: %.2f%%\n", average);
	        System.out.println("Grade: " + grade);
	        System.out.println("Remarks: " + remarks);
	}

}
