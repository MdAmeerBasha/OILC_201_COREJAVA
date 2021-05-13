package assignment5thMay;

import java.util.Scanner;

public class LeastNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the two  numbers");
		System.out.println(getLeastNum(scanner.nextInt(), scanner.nextInt()));
		scanner.close();
	}

	public static int getLeastNum(int num1, int num2) {
		int result = 0;
		if (num1 < 0 || num2 <= 0) {
			result = -1;
		} else if (num1 == 0 || num2 == 0) {
			result = -2;
		} else if (num1 < num2) {
			result = num1;
		} else {
			result = num2;
		}
		return result;
	}

}
