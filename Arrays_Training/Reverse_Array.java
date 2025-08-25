package Arrays_Training;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int c=0;
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int j=size-1;
		for(int i=0;i<size/2;i++)
		{
			c=arr[i];
			arr[i]=arr[j];
			arr[j]=c;
			j--;
		}
		System.out.print(Arrays.toString(arr));
		
	}

}
