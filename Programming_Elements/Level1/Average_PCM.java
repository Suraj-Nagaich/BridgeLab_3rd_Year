package Programming_Elements.Level1;

import java.util.Scanner;

public class Average_PCM {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the maths marks");
		int math=sc.nextInt();
		System.out.println("enter the physics marks");
		int phy=sc.nextInt();
		System.out.println("enter the chemistry marks");
		int chem=sc.nextInt();
		System.out.println("the average is:"+(math+phy+chem)/3);

	}

}
