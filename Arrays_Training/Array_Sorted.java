package Arrays_Training;

import java.util.Scanner;

public class Array_Sorted {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int f=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]<arr[i+1])
			{
				f=1;
				break;
			}
		}
			if(f==1)
			{
				System.out.print("not sorted");
		}
			else {
				System.out.print("sorted");
			}
	}

}
