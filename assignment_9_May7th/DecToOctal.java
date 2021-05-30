package assignment_9_May7th;

import java.util.Scanner;

public class DecToOctal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the Decemal Number to convert into Octal value");
		System.out.println(getOctal(scanner.nextInt()));
		scanner.close();
	}

	public static String getOctal(int num) {
		String res = "";
		int[] OctalNum = new int[1000];
		int i = 0;
		while (num > 0) {

			OctalNum[i] = num % 8;
			num = num / 8;
			i++;
		}

		for (int j = i - 1; j >= 0; j--)
			res += "" + (OctalNum[j]);

		return res;
	}

}
