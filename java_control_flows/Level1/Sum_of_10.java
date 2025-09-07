package java_control_flows.Level1;

import java.util.Scanner;

public class Sum_of_10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+i;
		}
		System.out.print(sum);
		
	}

}
