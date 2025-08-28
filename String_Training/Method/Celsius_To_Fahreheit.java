package String_Training.Method;

import java.util.Scanner;

public class Celsius_To_Fahreheit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter temperature in celsius");
		int cel=sc.nextInt();
		double f=((cel*9/5)+32);
		System.out.print(f);
	}

}
