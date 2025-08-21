package Assisted.Assignment_1;

import java.util.Scanner;

public class Simple_interest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the principle");
		int p=sc.nextInt();
		System.out.println("enter the rate");
		int r=sc.nextInt();
		System.out.println("enter time");
		int t=sc.nextInt();
		System.out.println((p*r*t)/100);
	}

}
