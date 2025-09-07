package String;

import java.util.Scanner;

public class Frequency_Character {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a string");
		String str=sc.next();
		System.out.print("enter the word that you are searching for");
		String elem=sc.next();
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==elem.charAt(0))
			{
				c++;
			}
		}
		System.out.print(c);
		
	}

}
