package assignment7thMay;

import java.util.Scanner;

public class CollatzSequence {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the   number");
		System.out.println(getSequence(scanner.nextInt()));
		scanner.close();
	}

	static String res = "";
	public static String getSequence(int num) {
		
		res = res + num + " ";

		if (num == 1) {
			return res;
		} else if (num % 2 == 0) {
			num = num / 2;
		} else {
			num = num * 3 + 1;
		}

		return getSequence(num);
	}

}
