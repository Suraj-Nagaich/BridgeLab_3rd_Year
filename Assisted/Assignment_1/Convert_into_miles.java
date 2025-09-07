package Assisted.Assignment_1;

import java.util.Scanner;

public class Convert_into_miles {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of kilometer");
		int kilometer=sc.nextInt();
		double miles=kilometer*0.621371;
		System.out.print(miles);
	}

}
