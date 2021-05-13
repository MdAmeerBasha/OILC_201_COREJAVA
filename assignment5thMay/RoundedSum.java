package assignment5thMay;

import java.util.Scanner;

public class RoundedSum {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter 3 the number");
	System.out.println(sumOfRoundedValues(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
	scanner.close();
    }

	public static int sumOfRoundedValues(int num1, int num2, int num3)

	{
		int result = 0;

		if (num1 <= 0 || num2 <= 0 || num3 <= 0) {
			result = -1;
		} else {
			result = getRound(num1) + getRound(num2) + getRound(num3);

		}
		return result;

	}
	public static int getRound(int num) {
		int output = 0;
		if (num % 10 < 5) {
			output =  (num / 10)  * 10;
		} else {
			output = ((num / 10) + 1) * 10;
		}
		return output;
	}
}
