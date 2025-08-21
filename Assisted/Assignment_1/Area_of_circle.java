package Assisted.Assignment_1;

import java.util.Scanner;

public class Area_of_circle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius");
		int r=sc.nextInt();
		double pi=3.14;
		System.out.println(pi*r*r);
	}

}
