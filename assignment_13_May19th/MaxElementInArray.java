package assignment_13_May19th;

import java.util.Scanner;

public class MaxElementInArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size = scanner.nextInt();
		System.out.println("Enter the Array Elements");
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("The Maximum Value in Given Array is " + getMax(arr));
	}

	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];

		return max;
	}

}
