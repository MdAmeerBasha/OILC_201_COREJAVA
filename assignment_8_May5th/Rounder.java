package assignment_8_May5th;

import java.util.Scanner;

public class Rounder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		System.out.println(calculate(scanner.nextInt()));
		scanner.close();

	}

	public static int calculate(int num) {
		int result = 0;
		if (num <= 0) {
			result = -1;
		} else if (num % 2 == 0) {
			result = num * num;
		} else {
			result = num * num * num;
		}
		return result;

	}

}
