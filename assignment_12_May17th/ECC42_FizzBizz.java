package assignment_12_May17th;

import java.util.Scanner;

public class ECC42_FizzBizz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scanner.nextInt();
		if (num > 0) {
			System.out.println(getFizzBizz(num));

		} else {
			System.out.println("Error");
		}
		scanner.close();

	}

	public static String getFizzBizz(int num) {
		String result = null;
		if (num % 3 == 0 && num % 5 == 0) {
			result = "FizzBizz";
		} else if (num % 3 == 0) {
			result = "Fizz";
		} else if (num % 5 == 0) {
			result = "Bizz";

		} else {
			result = "" + num;
		}
		return result;

	}

}
