package Assisted.Assignment_1;

import java.util.Scanner;

public class Celsius_to_fahrenheit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the temperature");
		int celsius=sc.nextInt();
		double fahr=((celsius*9/5)+32);
		System.out.print(fahr);
	}

}
