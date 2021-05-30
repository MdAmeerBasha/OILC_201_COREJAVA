package assignment_9_May7th;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		System.out.println(getFactor(scanner.nextInt()));
		scanner.close();

	}

	public static int getFactor(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;

	}

}
