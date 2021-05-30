package assignment_3_Apr24th;

import java.util.Scanner;

public class RussianMultiplication {

	public static void main(String[] args) {
		int n1, n2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Halving Number");
		n1 = scanner.nextInt();
		System.out.println("Enter Doubling number");
		n2 = scanner.nextInt();

		System.out.println(Russian.getRussian(n1, n2));

		scanner.close();
	}

}

class Russian {

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
