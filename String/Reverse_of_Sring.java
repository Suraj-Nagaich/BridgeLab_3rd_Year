package String;

import java.util.Scanner;

public class Reverse_of_Sring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter string");
		String str = sc.next();
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Reversed: " + reversed);
	}

}
