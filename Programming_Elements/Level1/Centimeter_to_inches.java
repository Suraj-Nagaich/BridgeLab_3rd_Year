package Programming_Elements.Level1;

import java.util.Scanner;

public class Centimeter_to_inches {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the value in centimeter");
        int cm=sc.nextInt();
        System.out.println("The height in inches:"+(cm/2.5)+"height in feet:"+(2.54*cm));
	}

}
