package ass18thMay;

import java.util.Scanner;

public class ECC47_OddSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size = scanner.nextInt();
		System.out.println("Enter the Array Elements");
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println(getOddSum(arr));
		scanner.close();
	}

	public static int getOddSum(int[] inputArray) {
		int sum = 0;
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
			} else if (inputArray[i] % 2 != 0) {
				sum=sum+inputArray[i];
				res=sum;
			}

		}

		return res;

	}

}
