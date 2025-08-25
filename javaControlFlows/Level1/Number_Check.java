package java_control_flows.Level1;

import java.util.Scanner;

public class Number_Check {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		if(n>0)
		{
			System.out.println("Positive number");
		}
		else if(n==0)
		{
			System.out.println("zero");
		}
		else {
			System.out.println("Negative Number");
		}
	}

}
