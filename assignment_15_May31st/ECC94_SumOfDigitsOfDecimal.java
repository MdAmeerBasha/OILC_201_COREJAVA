package assignment_15_May31st;

import java.util.Scanner;

public class ECC94_SumOfDigitsOfDecimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Two Numbers with . in between  ");
		System.out.println(concateSumOfDigits(scanner.nextDouble()));
		scanner.close();
	}

	static String concateSumOfDigits(double number) {

		String str = String.valueOf(number);
		String[] split = str.split("\\.");

		int first = Integer.parseInt(split[0]);
		int next = Integer.parseInt(split[1]);

		int sumOfDigitsBefore = getSumOfDigits(first);
		int sumOfDigitsAfter = getSumOfDigits(next);

		if (sumOfDigitsAfter == 0) {

			return "" + sumOfDigitsBefore;
		} else {
			return (sumOfDigitsBefore) + " : " + (sumOfDigitsAfter);
		}
	}

	static int getSumOfDigits(int num) {
		int sum = 0;
		while (num != 0) {
			sum = sum + (num % 10);
			num = num / 10;
		}
		return sum;
	}

}
