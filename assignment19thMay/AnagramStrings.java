package ass19thMay;

import java.util.*;

public class AnagramStrings {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first String :");
		String firstString = scanner.next();
		System.out.println("Enter second String :");
		String secondString = scanner.next();

		System.out.println(checkAnagramStrings(firstString, secondString));
		scanner.close();

	}

	public static String checkAnagramStrings(String firstString, String secondString) {

		String result = "";
		if (firstString.length() != secondString.length()) {
			result += "Given Words are not Anagram words";
		} else {
			char[] charArray1 = firstString.toCharArray();
			char[] charArray2 = secondString.toCharArray();

			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			boolean equals = Arrays.equals(charArray1, charArray2);
			if (equals == true) {
				result += "Given Words are  Anagram words";
			} else {
				result += "Given Words are not Anagram words";
			}
		}

		return result;

	}

}
