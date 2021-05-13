package assignment5thMay;

import java.util.Scanner;

public class BooleanValue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please Enter Three Boolean values:");
		System.out.println(countBoolean(scanner.nextBoolean(), scanner.nextBoolean(), scanner.nextBoolean()));
		scanner.close();
	}

	public static boolean countBoolean(boolean value1, boolean value2, boolean value3) {
		boolean result = false;
		int count = 0;

		if (value1) {
			count++;
		}
		if (value2) {
			count++;
		}
		if (value3) {
			count++;
		}

		if (count >= 2) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

}
