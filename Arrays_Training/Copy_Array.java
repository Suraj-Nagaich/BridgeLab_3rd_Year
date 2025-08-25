package Arrays_Training;

import java.util.Arrays;
import java.util.Scanner;

public class Copy_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int arr1[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			arr1[i]=arr[i];
		}
		System.out.print(Arrays.toString(arr1));
		
		
	}

}
