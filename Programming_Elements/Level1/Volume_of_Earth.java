package Programming_Elements.Level1;

import java.util.Scanner;

public class Volume_of_Earth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius");
		int r=sc.nextInt();
		System.out.println("enter the height");
		int h=sc.nextInt();
		double pi=3.14;
		System.out.println("the distance in km:"+(4/3)*pi*r*r*h+"and in miles:"+(4/3)*pi*r*r*h*1.6);
	}

}
