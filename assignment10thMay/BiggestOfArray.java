package assignment10thMay;

import java.util.Scanner;

public class BiggestOfArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the  size of array");
		int size = scanner.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("the biggest value is " + getBiggest(arr));
		scanner.close();
	}

	public static int getBiggest(int[] arr) {
		int biggest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (biggest < arr[i]) {
				biggest = arr[i];
			}

		}
		return biggest;
	}

}
