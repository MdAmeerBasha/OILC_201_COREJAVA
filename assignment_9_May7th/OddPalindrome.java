package assignment_9_May7th;

import java.util.Scanner;

public class OddPalindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Two numbers");
		System.out.println(getOddPalindrome(scanner.nextInt(), scanner.nextInt()));
		scanner.close();
	}

	public static String getOddPalindrome(int start, int end) {
		String res = "";

		for (int i = start; i <= end; i++) {
			if (isPalindrome(i) % 2 != 0) {
				res += i + " ";
			}
		}
		return res;
	}

	public static int isPalindrome(int num) {
		int rem, temp = num, res = 0;
		while (num > 0) {
			rem = num % 10;
			res = res * 10 + rem;
			num = num / 10;
		}
		if (res == temp) {
			return temp;
		} else {
			return 0;
		}
	}

}
