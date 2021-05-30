package assignment_8_May5th;

import java.util.Scanner;

public class SumOfMul10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 the number");
		System.out.println(sumOfMultiples(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
		scanner.close();
	}

	

	public static int sumOfMultiples(int num1, int num2, int num3)

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
		if (num % 10 == 0) {
			output = num;
		} else {
			output = ((num / 10) + 1) * 10;
		}
		return output;
	}

}
