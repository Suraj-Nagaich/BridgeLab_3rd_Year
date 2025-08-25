package java_control_flows.Level1;

import java.util.Scanner;

public class Elligible_Vote {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int n=sc.nextInt();
		if(n>18)
		{
			System.out.print("elligible for vote");
		}
		else {
			System.out.println("Not Elligible");
		}
		
	}

}
