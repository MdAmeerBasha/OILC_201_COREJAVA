package assignment_10_May10th;

import java.util.Scanner;

public class ArrayInRev {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println(getRev(arr));
		scanner.close();
	}

	public static String getRev(int[] arr) {
		String rev = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			rev += arr[i] + " ";
		}
		return rev;
	}

}
