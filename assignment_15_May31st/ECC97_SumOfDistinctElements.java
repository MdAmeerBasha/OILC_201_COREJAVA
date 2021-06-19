package assignment_15_May31st;

import java.util.Scanner;

public class ECC97_SumOfDistinctElements {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = scanner.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array Elements");
		{
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scanner.nextInt();
			}
		}
		System.out.println(getSum(arr));
		scanner.close();

	}

	public static int getSum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (getDistinctElements(array, array[i])) {
				sum += array[i];
			} else {
				sum += 0;
			}
		}
		return sum;
	}

	public static boolean getDistinctElements(int arr[], int num) {
		boolean b = true;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				count++;
			}
		}
		if (count > 1) {
			b = false;
		} else {
			b = true;
		}
		return b;

	}

}
