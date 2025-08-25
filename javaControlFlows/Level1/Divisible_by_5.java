package java_control_flows.Level1;

import java.util.Scanner;

public class Divisible_by_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number");
		int n=sc.nextInt();
		if(n%5==0)
		{
			System.out.println("divisible");
		}
		else {
			System.out.println("not divisible");
		}
	}

}
