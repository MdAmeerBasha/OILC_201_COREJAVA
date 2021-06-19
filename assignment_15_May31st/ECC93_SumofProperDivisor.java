package assignment_15_May31st;

import java.util.Scanner;

public class ECC93_SumofProperDivisor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		System.out.println(getDivisor(scanner.nextInt()));
		scanner.close();
	}

	public static int getDivisor(int num) {
		int res = 0;
		int sum = 0;
		if (num < 0) {
			res = -2;
		} else if (num == 0) {
			res = -3;
		} else {
			for (int i = 1; i < num; i++) {
				if (num % i == 0) {
					sum += i;
				}
			}
			if (sum == num) {
				res = 0;
			} else if (sum > num) {
				res = 1;
			} else {
				res = -1;
			}
		}

		return res;

	}

}
