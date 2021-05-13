package assignment7thMay;

import java.util.Scanner;

public class PrimeRange {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Starting and Ending  number");
		System.out.println(getRange(scanner.nextInt(), scanner.nextInt()));
		scanner.close();
	}

	public static String getRange(int num1, int num2) {
		String res = "";
		for (int i = num1; i <= num2; i++) {
			if (getPrime(i) != 0) {

				res += (getPrime(i) + " ");
			}

		}
		return res;

	}

	public static int getPrime(int num) {
		int result = 0;
		int nof = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				nof++;

			}
		}
		if (nof == 2) {
			result += num;
		}
		return result;

	}

}
