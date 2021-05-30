package assignment_11_May11th;

import java.util.Scanner;

public class Add2OneDim {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Elements in an Array one");
		int arr1[] = new int[5];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = scanner.nextInt();
		}
		System.out.println("Enter the Elements in an array Two");
		int arr2[] = new int[5];
		for (int j = 0; j < arr2.length; j++) {
			arr2[j] = scanner.nextInt();
		}
		int sum[] = sum(arr1, arr2);
		System.out.println("The  sum  of two array elemets are  : ");
		for (int i : sum) {
			System.out.print(i + " ");
		}
		scanner.close();
	}

	public static int[] sum(int[] arr1, int[] arr2) {
		int sum[] = new int[5];
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				sum[i] = arr1[i] + arr2[i];
			}
		}
		return sum;
	}

}
