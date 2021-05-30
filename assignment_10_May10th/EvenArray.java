package assignment_10_May10th;

import java.util.Scanner;

public class EvenArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scanner.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println(getEven(arr));
		scanner.close();

	}

	public static String getEven(int arr[]) {
		String even = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even += arr[i] + " ";
			}
		}
		return even;
	}

}
