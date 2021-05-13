package assignment7thMay;

import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the Number");
		System.out.println(getRev(scanner.nextInt()));
		scanner.close();
	}

	public static int getRev(int num) {

		int rem = 0;
		int rev = 0;
		while (num != 0) {
			rem = num % 10;
			num = num / 10;
			rev = rev * 10 + rem;
		}

		return rev;

	}

}
