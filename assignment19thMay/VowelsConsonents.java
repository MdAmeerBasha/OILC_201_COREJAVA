package ass19thMay;

import java.util.Scanner;

public class VowelsConsonents {
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
		String consonants = "";

		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vowels += str.charAt(i);
				break;
			default:
				consonants += str.charAt(i);
			}
		}

		res += "Vowels are in given String : " + vowels + "\nConsonants are in given String : " + consonants;

		return res;
	}

}
