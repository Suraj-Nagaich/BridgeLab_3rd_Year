package Programming_Elements.Level1;

import java.util.Scanner;

public class Number_of_handshake {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of students");
		int n=sc.nextInt();
		System.out.println("the total handshake is:"+(n*(n-1))/2);
	}

}
