package java_control_flows.Level1;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your salary");
		int sal=sc.nextInt();
		System.out.println("enter year");
		int year=sc.nextInt();
		if(year>5)
		{
			System.out.println(sal*0.05);
		}
	}

}
