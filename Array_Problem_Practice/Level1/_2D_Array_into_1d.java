package Array_Problem_Practice.Level1;

import java.util.Scanner;

public class _2D_Array_into_1d {
	public static void main(String args[])
	{
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter number of rows: ");
	        int rows = scanner.nextInt();
	        System.out.print("Enter number of columns: ");
	        int cols = scanner.nextInt();
	        int[][] arr = new int[rows][cols];
	        System.out.println("Enter elements for the 2D array:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print("Element [" + i + "][" + j + "]: ");
	                arr[i][j] = scanner.nextInt();
	            }
	        }
	        int[] arr1 = new int[rows * cols];
	        int index = 0;
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                arr1[index++] = arr[i][j];
	            }
	        }
	        System.out.println("\n2D Array:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }
	        System.out.println("\n1D Array (Flattened):");
	        for (int i = 0; i < arr1.length; i++) {
	            System.out.print(arr1[i] + " ");
	        }
	}

}
