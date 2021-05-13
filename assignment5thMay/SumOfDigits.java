package assignment5thMay;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		System.out.println(getSumOfDigits(scanner.nextInt()));
		scanner.close();
	}

	public static int getSumOfDigits(int num) {
		int result = 0;
		int sum = 0;

		if (num < 0) {
			result = -3;
		} else if (num > 99) {
			result = -2;
		} else if (num > 0 && num < 9) {
			result = -1;
		} else {
			if (num > 10 && num < 99) {
				sum = num % 10;
				num = num / 10;

			}

			result = sum + num;

		}
		return result;

	}
}
