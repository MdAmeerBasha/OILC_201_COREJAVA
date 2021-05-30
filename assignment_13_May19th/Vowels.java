package assignment_13_May19th;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any String: ");
		System.out.println(getVowelsConsonants(scanner.nextLine()));
		scanner.close();
	}

	public static String getVowelsConsonants(String str) {
		str = str.toUpperCase();
		String res = "";
		String vowels = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
					|| str.charAt(i) == 'U') {

				vowels += str.charAt(i);
			}
		}

		res += "Vowels are in given String : " + vowels;
		return res;
	}

}
