package assignment_10_May10th;

import java.util.Scanner;

public class PrimeArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = scanner.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println(getPrimeArray(arr));
		scanner.close();
	}

	public static String getPrimeArray(int[] arr) {
		String prime = "";
		for (int i = 0; i < arr.length; i++) {
			if (getPrime(arr[i]) != 0) {
				prime += " " + arr[i];
			}

		}
		return prime;
	}

	public static int getPrime(int num) {
		int res = 0;
		int nof = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				nof++;
			}
		}
		if (nof == 2) {
			res += num;
		} else {
			res = 0;
		}
		return res;
	}

}
