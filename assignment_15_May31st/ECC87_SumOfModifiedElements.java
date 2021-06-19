package assignment_15_May31st;

import java.util.Scanner;

public class ECC87_SumOfModifiedElements {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size = scanner.nextInt();
		System.out.println("Enter the Array Elements");
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("The sum of Modified Elemets in given array are : " + getSumOfModifiedElements(arr));
		scanner.close();
	}

	public static int getSumOfModifiedElements(int[] arr) {
		int even = 0;
		int odd = 0;
		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr.length == 0) {
				result = -1;
				break;
			} else if (arr[i] < 0) {
				result = -2;
				break;
			} else if (arr[i] == 0) {
				result = -3;
				break;
			}

			else {
				if (arr[i] % 2 == 0) {
					even += arr[i] + arr[i];
				} else {
					odd += arr[i] / 2;
				}
				result = even + odd;
			}
		}
		return result;

	}

}
