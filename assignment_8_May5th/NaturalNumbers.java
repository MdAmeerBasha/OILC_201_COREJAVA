package assignment_8_May5th;

import java.util.Scanner;

public class NaturalNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Two numbers");
		System.out.println(getNaturalNumbers(scanner.nextInt(), scanner.nextInt()));
		scanner.close();
	}

	static String getNaturalNumbers(int firsttNumber, int lastNumber) {
		String result = "";
		if (firsttNumber < 0 || lastNumber < 0) {

			result += -1;

		} else if (firsttNumber == 0 || lastNumber == 0) {
			result += -2;
		} else if (firsttNumber < lastNumber) {

			int i = firsttNumber;
			while (i <= lastNumber) {

				result += i + " ";
				i++;
			}

		} else {
			result += "firstNumber is greater then lastNumber :";
		}

		return result;

	}

}
