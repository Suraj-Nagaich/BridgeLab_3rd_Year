package java_control_flows.Level1;

import java.util.Scanner;

public class Spring_Season {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter date");
		int date=sc.nextInt();
		System.out.println("enter month");
		int month=sc.nextInt();
		if(date>=20&&month>=3&&month<=6)
		{
			System.out.print("Spring Season");
		}
		else {
			System.out.println("Not Spring season");
		}
		
	}

}
