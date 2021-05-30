package assignment_8_May5th;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		System.out.println(isEvenOrOdd(scanner.nextInt()));
		scanner.close();

	}

	public static String isEvenOrOdd(int num) {
		String result = "";
		if (num <= 0) {
			result = "Invalid Input";
		} else if (num % 2 == 0) {
			result = "Even";
		} else {
			result = "Odd";
		}
		return result;
	}

}
