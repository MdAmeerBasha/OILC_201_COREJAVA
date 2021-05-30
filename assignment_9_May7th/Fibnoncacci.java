package assignment_9_May7th;

import java.util.Scanner;

public class Fibnoncacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		System.out.println(getFeb(scanner.nextInt()));
		scanner.close();
	}

	public static String getFeb(int num) {
		String result = "";

		int n1 = 0, n2 = 1, n3, i;
		result = n1 + " " + n2;

		for (i = 2; i < num; ++i) {
			n3 = n1 + n2;
			result += " " + n3;
			n1 = n2;
			n2 = n3;
		}
		return result;

	}

}
