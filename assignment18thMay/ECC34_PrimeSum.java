package ass18thMay;

import java.util.Scanner;

public class ECC34_PrimeSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Starting number and Ending Number");
		System.out.println(getRange(scanner.nextInt(), scanner.nextInt()));
		scanner.close();
	}

	public static String getRange(int start, int end) {
		String result = "";
		int sum = 0;

		if (start < 0 || end < 0) {
			result = "" + -1;
		}
		if (start == 0 || end == 0) {
			result = "" + -2;
		} else if (start >= end) {
			result = "" + -3;
		} else {
			for (int i = start + 1; i < end; i++) {
				if (prime(i) != 0) {

					sum = sum + (prime(i));
				}
				result = sum + " ";

			}

		}
		return result;
	}

	public static int prime(int num) {
		int res = 0;
		int nof = 0;

		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {
				nof++;
			}
		}

		if (nof == 2) {
			res += num;
		}

		return res;

	}
}
