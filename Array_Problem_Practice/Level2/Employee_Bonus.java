package Array_Problem_Practice.Level2;

import java.util.Scanner;

public class Employee_Bonus {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        final int EMPLOYEES = 10;
	        double[][] employeeData = new double[EMPLOYEES][2];  
	        double[][] bonusAndNewSalary = new double[EMPLOYEES][2];
	        double totalBonus = 0.0;
	        double totalOldSalary = 0.0;
	        double totalNewSalary = 0.0;
	        for (int i = 0; i < EMPLOYEES; i++) {
	            System.out.println("Enter details for employee " + (i + 1) + ":");
	            System.out.print("Salary: ");
	            double salary = scanner.nextDouble();
	            if (salary <= 0) {
	                System.out.println("Invalid salary. Please enter a positive number.");
	                i--;  
	                continue;
	            }
	            System.out.print("Years of Service: ");
	            double years = scanner.nextDouble();
	            if (years < 0) {
	                System.out.println("Invalid years of service. Please enter 0 or more.");
	                i--; 
	                continue;
	            }
	            employeeData[i][0] = salary;
	            employeeData[i][1] = years;
	        }
	        for (int i = 0; i < EMPLOYEES; i++) {
	            double salary = employeeData[i][0];
	            double years = employeeData[i][1];
	            double bonusPercentage = (years > 5) ? 0.05 : 0.02;
	            double bonus = salary * bonusPercentage;
	            double newSalary = salary + bonus;
	            bonusAndNewSalary[i][0] = bonus;
	            bonusAndNewSalary[i][1] = newSalary;
	            totalBonus += bonus;
	            totalOldSalary += salary;
	            totalNewSalary += newSalary;
	        }
	        System.out.println("\nEmployee Details:");
	        System.out.println("Emp#\tOld Salary\tYears\tBonus\t\tNew Salary");
	        System.out.println(" ");
	        for (int i = 0; i < EMPLOYEES; i++) {
	            System.out.printf("%d\t%.2f\t\t%.1f\t%.2f\t\t%.2f\n",
	                    (i + 1),
	                    employeeData[i][0],
	                    employeeData[i][1],
	                    bonusAndNewSalary[i][0],
	                    bonusAndNewSalary[i][1]);
	        }
	        System.out.println("\nTotals:");
	        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
	        System.out.printf("Total Bonus Payout: %.2f\n", totalBonus);
	        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
	}

}
