package Array_Problem_Practice.Level1;

import java.util.Scanner;

public class Elligible_For_Vote {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			if(arr[i]>=18)
			{
				System.out.println("elligible for vote"+ arr[i]+" ");
				
			}
			else {
				System.out.println("not elligible for vote"+ arr[i]+" ");
				
			}
		}
	}

}
