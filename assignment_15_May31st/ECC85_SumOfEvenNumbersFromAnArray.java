package assignment_15_May31st;

import java.util.Scanner;

public class ECC85_SumOfEvenNumbersFromAnArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size = scanner.nextInt();
		System.out.println("Enter the Array Elements");
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("The sum of Even Numbers in given array are : " + getSumOfEvenNumFromArray(arr));
		scanner.close();
	}

	public static int getSumOfEvenNumFromArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum = sum + arr[i];
			}
		}
		return sum;

	}

}
