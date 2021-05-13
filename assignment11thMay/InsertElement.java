package assignment11thMay;

import java.util.Scanner;

public class InsertElement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Element in an array");
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter the Insertion value");
		int value = scanner.nextInt();
		System.out.println("Enter the location which value you want to change");
		int loc = scanner.nextInt();
		for (int i = 0; i <= arr.length; i++) {
			if (i == loc) {
				arr[i] = value;
			}
		}
		for (int m : arr) {
			System.out.println(m);
		}

		scanner.close();

	}

}
