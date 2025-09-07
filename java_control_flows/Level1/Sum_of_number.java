package java_control_flows.Level1;

import java.util.Scanner;

public class Sum_of_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int sum=0;
		while(n>0)
		{
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		System.out.println(sum);
		
	}

}
