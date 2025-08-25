package Programming_Elements.Level1;

import java.util.Scanner;

public class Area_of_Triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the base");
		int b=sc.nextInt();
		System.out.println("enter height");
		int h=sc.nextInt();
		System.out.println("Area is:"+(1*b*h)/2);
	}

}
