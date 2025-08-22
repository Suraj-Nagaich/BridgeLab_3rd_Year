package Programming_Elements.Level2;

import java.util.Scanner;

public class Yards_and_miles {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size in feet");
		int feet=sc.nextInt();
		System.out.println("the size in yards:"+(feet/3)+"the size in miles:"+(feet/3)/1760);
	}

}
