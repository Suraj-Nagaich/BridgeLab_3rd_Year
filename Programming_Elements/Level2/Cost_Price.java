package Programming_Elements.Level2;

import java.util.Scanner;

public class Cost_Price {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the quantity");
		int q=sc.nextInt();
		System.out.println("enter the unit price");
		int up=sc.nextInt();
		System.out.println("the costprice is:"+(q*up));
	}

}
