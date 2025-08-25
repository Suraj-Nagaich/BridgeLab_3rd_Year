package java_control_flows.Level1;

import java.util.Scanner;

public class Rocket_Launch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int counter=sc.nextInt();
		while(counter>1)
		{
			System.out.println(counter);
			counter--;
		}
		
		}

}
