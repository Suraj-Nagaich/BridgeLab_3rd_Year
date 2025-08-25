package Arrays_Training;

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
		System.out.println("enter the searched elemnt");
		int ele=sc.nextInt();;
		for(int i=0;i<size;i++)
		{
			if(arr[i]==ele)
			{
				count++;
			}

		}
		System.out.print(count);
	}

}
