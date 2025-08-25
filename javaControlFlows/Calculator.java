package java_control_flows;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		System.out.println("enter a value of a");
		int a=sc.nextInt();
		System.out.println("enter a value of b");
		int b=sc.nextInt();
		if(n==1)
		{
			System.out.println(a+b);
		}
		if(n==2)
		{
			System.out.print(a-b);
		}
		if(n==3)
		{
			System.out.print(a*b);
		}
		if(n==4)
		{
	        System.out.print(a/b);
		}
		
	}
}
