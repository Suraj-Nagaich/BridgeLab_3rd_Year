package Assisted.Assignment_1;

import java.util.Scanner;

public class Perimeter_of_rectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length");
		int l=sc.nextInt();
		System.out.println("enter breadth");
		int b=sc.nextInt();
		System.out.print(2*(l+b));
	}

}
