package assignment7thMay;

import java.util.Scanner;

public class RevString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Original string : ");

		System.out.println(getReverse(scanner.nextLine()));
		scanner.close();
	}

	static String getReverse(String originalStr) {
		String revStr = "";
		String words[] = originalStr.split("\\s");

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String revWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				revWord = revWord + word.charAt(j);
			}
			revStr = revStr + revWord + " ";
		}

		return revStr;
	}
}
