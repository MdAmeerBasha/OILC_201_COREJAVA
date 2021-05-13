package assignment5thMay;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter Number the number");
		System.out.println(isPalindrome(scanner.nextInt()));
		scanner.close();
	}

	public static int isPalindrome(int num) {
		int result = 0;

		if (num > 99 && num < 1000) {
			int temp = num;
			int rem = 0;
			int rev = 0;
			while (num != 0) {
				rem = num % 10;
				num = num / 10;
				rev = rev * 10 + rem;
			}
			if (temp == rev) {
				result = 1;
			} else {
				result = 0;
			}
		}

		else if (num <= 0) {
			result = -1;
		} else {
			result = -2;
		}
		return result;

	}

}
