package assignment5thMay;

import java.util.Scanner;

public class DigitChecker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		System.out.println(getDiffOfDigits( scanner.nextInt()));
		scanner.close();
	}

	public static int getDiffOfDigits(int num) {
		int result = 0;
		int diff = 0;
		if (num < 0) {
			result = -3;
		} else if (num > 99) {
			result = -2;
		} else if (num > 0 && num < 9) {
			result = -1;
		} else {
			if (num > 10 && num < 99) {

				int firstNum = num / 10;// first number
				int lastNum = num % 10;// last number
				diff = firstNum - lastNum;
			}
			result = diff;
		}
		return result;

	}
}
