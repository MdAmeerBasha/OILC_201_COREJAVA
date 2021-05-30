package assignment_9_May7th;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the Number");
		System.out.println(arm(scanner.nextInt()));
		scanner.close();
	}

	public static String arm(int num) {
		String result = "";
		int temp = num;
		int num2 = 0;

		while (num != 0) {
			int a = num % 10;
			num = num / 10;
			num2 = num2 + (a * a * a);
		}
		if (temp == num2) {
			result += "ArmStrong Number";
		} else {
			result += "Not ArmStrong Number";
		}
		return result;
	}

}
