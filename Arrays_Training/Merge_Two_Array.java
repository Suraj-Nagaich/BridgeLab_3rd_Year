package Arrays_Training;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_Two_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the size of 2nd array");
		int size1=sc.nextInt();
		int arr1[]=new int[size1];
		for(int i=0;i<size1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int j=size+size1;
		int c=0;
		int arr2[]=new int[j];
		for(int k=0;k<j;k++)
		{
			if(k<size)
			{
				arr2[k]=arr[c];
				c++;
			}
			else {
				arr2[k]=arr1[c-size];
				c++;
			}
		}
		System.out.print(Arrays.toString(arr2));
		
		
	}

}
