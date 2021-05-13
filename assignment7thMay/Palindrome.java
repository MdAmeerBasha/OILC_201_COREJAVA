package assignment7thMay;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the Number");
		System.out.println(isPalin(scanner.nextInt()));
		scanner.close();
	}

	public static String isPalin(int n) {
		String result = "";
		int temp = n;
		int rem = 0;
		int rev = 0;
		while (n != 0) {
			rem = n % 10;
			n = n / 10;
			rev = rev * 10 + rem;
		}
		if (temp == rev) {
			result += "Palindrome";
		} else {
			result += "Not Palindrome";

		}
		return result;

	}

}
