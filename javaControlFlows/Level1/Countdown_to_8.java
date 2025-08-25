package java_control_flows.Level1;

import java.util.Scanner;

public class Countdown_to_8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		for(int i=8;i>=n;i--) {
			System.out.println(i);
		}
			
		
	}

}
