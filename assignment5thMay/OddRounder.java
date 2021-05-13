package assignment5thMay;

import java.util.Scanner;

public class OddRounder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		System.out.println(getOddNumber(scanner.nextInt()));
		scanner.close();

	}

	public static int getOddNumber(int num) {
		int result = 0;

		if (num < 0) {
			result = -1;
		} else if (num == 0) {
			result = -2;
		} else if (num % 2 == 0) {
			result = num;
		} else {
			int odd = num / 10;
			result = ((odd + 1) * 10);
		}

		return result;

	}

}
