package Assisted.Assignment_1;

import java.util.Scanner;

public class Average_three_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of  number");
		int n=sc.nextInt();
		System.out.println("enter the value of first number");
		int a=sc.nextInt();
		System.out.println("enter the value of second number");
		int b=sc.nextInt();
		System.out.println("enter the value of third number");
		int c=sc.nextInt();
		System.out.println((a+b+c)/n);
	}

}
