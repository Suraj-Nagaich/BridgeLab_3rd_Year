package String_Training.Method;

import java.util.*;

public class Largest_Among_ThreeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		System.out.println("enter the third number");
		int c=sc.nextInt();
		int d=Math.max(a, b);
		int e=Math.max(d,c);
		System.out.print(e);
		
	}

}
