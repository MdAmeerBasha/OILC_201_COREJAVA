package ass19thMay;

import java.util.Scanner;

public class NameScore {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		System.out.println("The Total Score of given string "+getScore(scanner.next()));
		scanner.close();

	}

	public static String getScore(String str) {
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			int num = (int) str.charAt(i);
			if (num > 64 && num < 91) {
				sum += num - 64;
			} else if (num > 96 && num < 123) {
				sum += num - 96;
			} else {
				sum = -1;
				break;
			}

		}
		return sum+"";
	}

}
