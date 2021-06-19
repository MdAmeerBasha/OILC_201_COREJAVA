package assignment_15_May31st;

import java.util.Scanner;

public class ECC83_WordsContainPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The count of words do you want");
		int size = scanner.nextInt();
		String words[] = new String[size];
		System.out.println("Enter an Array of Words ");
		for (int i = 0; i < words.length; i++) {
			words[i] = scanner.next();
			words[i] = words[i].toUpperCase();
		}
		System.out.println("Enter search Pattern:");
		String pattern = scanner.next();
		pattern = pattern.toUpperCase();

		String result[] = getWordsContainPattern(words, pattern);
		for (int i = 0; i < result.length; i++) {
			if (result[i] != null) {
				System.out.println(result[i]);
			}
		}
		scanner.close();
	}

	public static String[] getWordsContainPattern(String[] words, String pattern) {
		String res[] = new String[words.length];
		int j = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].contains(pattern)) {
				res[j] = words[i];
				j++;
			}
		}
		return res;
	}
}
