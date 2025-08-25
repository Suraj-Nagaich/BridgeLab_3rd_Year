package Programming_Elements.Level1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=sc.nextInt();
		System.out.println("enter the value of b");
		int b=sc.nextInt();
		System.out.println("the addition is:"+(a+b)+"and subtraction is:"+(a-b)+"multiplication is:"+(a*b)+"division is:"+(a/b));
	}

}
