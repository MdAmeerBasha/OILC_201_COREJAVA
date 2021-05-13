package assignment7thMay;

import java.util.Scanner;

public class TwinPrime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Numbers");
		System.out.println(getPrime(scanner.nextInt(), scanner.nextInt()));
		scanner.close();
	}

	public static String getPrime(int num1, int num2) {
		String res = "";
		for (int i = num1; i <= num2; i++) {
			if ((getTwinPrime(i) == 0) && (getTwinPrime(i + 2) == 0)) {
				res += i + "," + (i + 2) + ";";
			}
		}
		return res;

	}

	public static int getTwinPrime(int num) {
		int f = 0;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				f = 1;
				break;
			}
		}

		return f;
	}
}
