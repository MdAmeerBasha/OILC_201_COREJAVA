package assignment_12_May17th;

import java.util.Scanner;

public class ECC46_OddCount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size = scanner.nextInt();
		System.out.println("Enter the Array Elements");
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println(getCount(arr));
		scanner.close();
	}

	public static int getCount(int[] inputArray) {
		int count = 0;
		int res = 0;

		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray.length != 5) {
				res = -1;
			} else if (inputArray[i] <= 0) {
				res = -2;
			} else if (inputArray[i] % 2 == 0) {
				res = -3;
			} else if (inputArray.length == 0) {
				res = -4;
			} else {
				count++;
				res = count;
			}

		}

		return res;

	}
}
