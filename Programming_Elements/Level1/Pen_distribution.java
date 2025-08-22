package Programming_Elements.Level1;

import java.util.Scanner;

public class Pen_distribution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of pens");
		int pen=sc.nextInt();
		System.out.println("enter the no of students");
		int student=sc.nextInt();
		System.out.println("the pen per student is:"+(pen/student)+"and remaining is:"+(pen%student));
	}

}
