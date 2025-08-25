package Array_Problem_Practice.Level2;

import java.util.Scanner;

public class Frequency_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of array");
		int size=sc.nextInt();
		int count=0;
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			if(arr[i]==arr[i])
			{
				count++;
			}

		}
		System.out.print(count);
	}

}
