package Programming_Elements.Level1;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the fees");
		int fees=sc.nextInt();
		System.out.println("enter the discount percent");
		int dis=sc.nextInt();
		int disc=(fees/dis)*100;
		System.out.println("Discount is:"+disc);
	}

}
