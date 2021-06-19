package assignment_15_May31st;

import java.util.*;

public class ECC95_ValidEmailId {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any Email Id : ");
		System.out.println(isValidEmail(scanner.next()));
		scanner.close();
	}

	public static String isValidEmail(String email) {
		String res = "";
		String end = "";
		boolean b = true;
		int count = 0;
		int firstChar = (int) email.charAt(0);

		if (firstChar < 97 || firstChar > 122) {
			res += -1;
		} else {
			for (int i = 0; i < email.length(); i++) {
				int lowerCase = (int) email.charAt(i);

				if (email.charAt(i) == '@') {
					count++;
				} else if (email.charAt(i) == '.' && b && count == 1) {
					b = false;
					for (int j = i + 1; j < email.length(); j++) {
						end += email.charAt(j);
					}
				} else if ((lowerCase < 97 || lowerCase > 122) && email.charAt(i) != '_' && lowerCase < 0
						&& email.charAt(i) != '.') {
					res += -5;
				}
			}

			if (count == 0) {
				res += -2;
			} else if (count > 1) {
				res += -3;

			} else if (end.equals("com") || end.equals("co.in")) {

			} else {
				res += -4;
			}
		}

		if (res.length() == 0) {
			res = "Valid";
		}

		return res;
	}

}
