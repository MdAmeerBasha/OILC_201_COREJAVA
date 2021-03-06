package assignment_9_May7th;

import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter starting and ending numbers");
		System.out.println(getNumbersInRanges(scanner.nextInt(), scanner.nextInt()));
		scanner.close();

	}

	public static String getNumbersInRanges(int start, int end) {
		String res = "";

		if (start < 0 || end < 0) {
			res = "" + -1;
		} else if (start == end) {
			res = "" + -2;
		} else if (start < end) {
			res = "" + -3;
		} else if (start - end == 1) {
			res = "" + -4;
		} else {
			for (int i = start - 1; i > end; i--) {
				res += i + " ";
			}
		}

		return res;
	}

}
