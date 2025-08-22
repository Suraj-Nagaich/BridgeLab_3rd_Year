package Programming_Elements.Level2;

import java.util.Scanner;

public class Float_operations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		double a=sc.nextDouble();
		System.out.println("enter the second number");
		double b=sc.nextDouble();
		System.out.println("enter the 3rd number");
		double c=sc.nextDouble();
		System.out.println("the first order is:"+(a+b*c)+"second order is:"+(a*b+c)+"third order is:"+(c+a/b)+"fourth order is:"+(a%b+c));
	}
}
