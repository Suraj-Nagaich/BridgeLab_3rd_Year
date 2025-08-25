package Programming_Elements.Level1;

import java.util.Scanner;

public class Profit_Loss {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the cost price");
		int cp=sc.nextInt();
		System.out.println("enter the selling price");
		int sp=sc.nextInt();
		int profit=sp-cp;
		int profitPer=profit/(cp*100);
		System.out.println("the profit is:"+profit+"and profit percent is:"+profitPer);
	}

}
