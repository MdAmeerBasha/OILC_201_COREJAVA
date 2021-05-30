package assignment_9_May7th;

import java.util.Scanner;

public class FindNumberOfDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the Number");
		System.out.println(digits(scanner.nextInt()));
		scanner.close();

	}

	public static int digits(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		return count;

	}

}
