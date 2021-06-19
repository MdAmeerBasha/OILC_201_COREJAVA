package assignment_15_May31st;

import java.util.Scanner;

public class ECC89_KaprekarNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the any number");
		int num = scanner.nextInt();
		System.out.println(isKaprekarNumber(num));
		scanner.close();

	}

	public static String isKaprekarNumber(int num) {

		String res = "";

		if (num < 0) {
			res = "" + -1;
		} else if (num == 0) {
			res = "" + -2;
		} else {
			int sum = 0;
			int square = num * num;
			String number = Integer.toString(square);
			int length = number.length();
			int parts = length / 2;
			String firstPart = number.substring(0, parts);
			String secondPart = number.substring(parts);

			sum = Integer.parseInt(firstPart) + Integer.parseInt(secondPart);

			if (sum == num) {
				res += "True";
			} else {
				res += "False";
			}
		}
		return res;

	}

}
