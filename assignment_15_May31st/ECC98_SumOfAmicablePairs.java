package assignment_15_May31st;

import java.util.Scanner;

public class ECC98_SumOfAmicablePairs {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int num = scanner.nextInt();
		System.out.println(sumOfAmicablePairs(num));
		scanner.close();

	}

	static int sumOfAmicablePairs(int num) {
		int pair = 0;
		int first = getSumOfProperDivisors(num);
		int second = getSumOfProperDivisors(first);

		if (second == num) {
			pair = first;
		}

		return pair;
	}

	static int getSumOfProperDivisors(int num) {
		int sum = 0;

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}

		return sum;
	}

}
