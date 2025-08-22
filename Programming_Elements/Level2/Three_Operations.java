package Programming_Elements.Level2;

import java.util.Scanner;

public class Three_Operations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		System.out.println("enter the 3rd number");
		int c=sc.nextInt();
		System.out.println("the first order is:"+(a+b*c)+"second order is:"+(a*b+c)+"third order is:"+(c+a/b)+"fourth order is:"+(a%b+c));
	}
	}

