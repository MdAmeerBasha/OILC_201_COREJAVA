package ass18thMay;

import java.util.Scanner;

public class ECC37_SumOfArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size");
		int size = scanner.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Array Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println(getSum(arr));
		scanner.close();
	}

	public static int getSum(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == -i) {
				System.out.println("please enter the valid number");
			} else {

				sum = sum + (arr[i]);

			}

		}
		return sum;

	}

}
