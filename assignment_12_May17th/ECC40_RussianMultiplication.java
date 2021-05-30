package assignment_12_May17th;

import java.util.Scanner;

public class ECC40_RussianMultiplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Halving Number and Doubling Number");
		System.out.println(getRussian(scanner.nextInt(), scanner.nextInt()));
		scanner.close();
	}

	public static String getRussian(int n1, int n2) {
		int product = 0;
		if (n1 > 0 && n2 > 0) {
			if (n1 % 2 != 0)
				product = product + n2;
			while (n1 != 1) {
				n1 = n1 / 2;
				n2 = n2 * 2;
				if (n1 % 2 != 0)
					product = product + n2;
			}

			return "" + product;
		} else
			return "" + (-1);
	}
}
