package assignment_15_May31st;

import java.util.Scanner;

public class ECC84_NearestMinValue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the arrays");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println(getNearestMinValue(arr));
	}
	public static int getNearestMinValue(int[] arr)
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min-1;
	}

}
