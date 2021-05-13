package assignment10thMay;

import java.util.Scanner;

public class SmallestOfArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scanner.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("smallest value is "+getSmallest(arr));
		scanner.close();
	}

	public static int getSmallest(int[] arr) {
		int smallest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (smallest > arr[i]) {
				smallest = arr[i];
			}
		}
		return smallest;
	}

}
