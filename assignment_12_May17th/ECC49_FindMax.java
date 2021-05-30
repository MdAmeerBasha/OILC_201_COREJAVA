package assignment_12_May17th;

import java.util.Scanner;

public class ECC49_FindMax {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter array size");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.println("enter Array values");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println(findMax(arr));
		scanner.close();
	}

	public static int findMax(int[] arr) {
		int biggest = 0;
		int count = 0;
		if (arr == null) {
			biggest = 0;
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] < 0) {
					count++;
				} else if (biggest < arr[i]) {
					biggest = arr[i];
				}
			}

			if (count < 3) {
				biggest = -1;
			}
		}

		return biggest;
	}

}
