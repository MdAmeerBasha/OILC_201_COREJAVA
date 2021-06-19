package assignment_15_May31st;

import java.util.Scanner;

public class ECC90_MorseCode {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the any String");
		String str = scanner.next();
		char[] ch = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		String[] code = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		System.out.println(getMorseCode(str, ch, code));
		scanner.close();

	}

	public static String getMorseCode(String str, char[] ch, String[] code) {
		String res = "";
		if (str.equals(null)) {
			res = "Null String";
		} else if (str.length() == 0) {
			res = "Empty String";
		} else {
			for (int i = 0; i < str.length(); i++) {
				for (int j = 0; j < ch.length; j++) {
					if (Character.isAlphabetic(str.charAt(i))) {
						if (str.charAt(i) == ch[j]) {
							res += code[j] + " ";
						}
					} else {
						res = "Invalid Letter";
					}

				}
			}

		}

		return res;

	}

}
