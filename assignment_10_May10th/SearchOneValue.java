package assignment_10_May10th;

import java.util.Scanner;

public class SearchOneValue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter the Search element");
		int searchElemenet = scanner.nextInt();
		System.out.println(getOneValue(arr, searchElemenet));
		scanner.close();
	}

	public static String getOneValue(int[] arr, int searchElemenet) {
		String res = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchElemenet) {
				res += searchElemenet + "  Element is present at index value of " + i;
			}
		}
		return res;
	}

}
