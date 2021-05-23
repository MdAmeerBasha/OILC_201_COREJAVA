package ass19thMay;

import java.util.Scanner;

public class ColumnSum {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the array size");
		int rows = scanner.nextInt();
		int columns = scanner.nextInt();
		int[][] arr = new int[rows][columns];
		System.out.println("The Column sum is : " + getColumnSum(arr));
	}

	public static String getColumnSum(int[][] arr) {
		int sum = 0;
		String res = "";
		if (arr.length != 3 || arr[0].length != 3) {
			res = null;
		} else {
			System.out.println("Enter the values into array");
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = scanner.nextInt();
				}
			}
			System.out.println("Array Elements are :");
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			for (int i = 0; i < arr.length; i++) {
				sum = 0;
				for (int j = 0; j < arr[i].length; j++) {
					sum += arr[j][i];
				}
				res += sum + " ";
			}
		}
		return res;

	}

}
