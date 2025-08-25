package Programming_Elements.Level1;

import java.util.Scanner;

public class Distance_in_yards {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size in feet");
		int feet=sc.nextInt();
		System.out.println("the size in yards:"+(feet/3)+"the size in miles:"+(feet/3)/1760);
	}

}
