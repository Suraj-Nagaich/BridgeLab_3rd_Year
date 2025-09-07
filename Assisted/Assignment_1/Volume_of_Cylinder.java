package Assisted.Assignment_1;

import java.util.Scanner;

public class Volume_of_Cylinder {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the radius");
	int r=sc.nextInt();
	System.out.println("enter the height");
	int h=sc.nextInt();
	double pi=3.14;
	System.out.print(pi*r*r*h);
	}

}
