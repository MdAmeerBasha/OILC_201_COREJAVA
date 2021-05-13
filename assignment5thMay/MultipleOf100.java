package assignment5thMay;

import java.util.Scanner;

public class MultipleOf100 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the Number");
		System.out.println(getNextMultipleOf100(scanner.nextInt()));
		scanner.close();
	}

	public static int getNextMultipleOf100(int num) {
		int result = 0;
		if (num > 0) {
			int mul = num / 100;
			int output = ((mul + 1) * 100);

			result = output;
		} else {
			result = -1;
		}
		return result;
	}

}
