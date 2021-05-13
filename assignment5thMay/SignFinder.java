package assignment5thMay;

import java.util.Scanner;

public class SignFinder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the Number");
		System.out.println(FindSign(scanner.nextInt()));
		scanner.close();
	}

	public static int FindSign(int num) {
		int result = 0;
		if (num > 0) {
			result = 1;
		} else if (num < 0) {
			result = -1;
		} else {
			result = 0;
		}
		return result;
	}

}
