package assignment_7_May4th;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Char");
		String res = " ";

		char str = scanner.next().toUpperCase().charAt(0);
		if (Character.isLetter(str)) {
			boolean b = false;
			switch (str) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				b = true;
				break;

			}
			if (b) {
				res = str + " is Vowel";
			} else {
				res = str + " is constant";
			}
			System.out.println(res);
		} else {
			System.out.println("Invalid charcter");
		}
		scanner.close();
	}

}
