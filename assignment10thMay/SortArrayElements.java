package assignment10thMay;

import java.util.Scanner;

public class SortArrayElements {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		int result[] = getSort(arr);
		System.out.println("Elemets After sorting: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(result[i]);
		}
		scanner.close();
	}

	public static int[] getSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = 0;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

}
