package assignment_15_May31st;

import java.util.Scanner;

public class ECC92_PositiveString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scanner.next();
		System.out.println(getPositiveString(str));
		scanner.close();
	}

	public static boolean getPositiveString(String str) {
		boolean b = true;
		str = str.toUpperCase();
		char ch1 = str.charAt(0);

		for (int i = 1; i < str.length(); i++) {
			char ch2 = str.charAt(i);
			if (ch1 > ch2) {
				b = false;
				break;
			}
			ch1 = ch2;

		}

		return b;

	}

}
