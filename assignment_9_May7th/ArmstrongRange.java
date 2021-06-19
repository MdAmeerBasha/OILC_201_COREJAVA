package assignment_9_May7th;

import java.util.Scanner;

public class ArmstrongRange {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the Two  Numbers");
		System.out.println(getRange(scanner.nextInt(), scanner.nextInt()));
		scanner.close();
	}

	public static String getRange(int num1, int num2) {
		String res = "";
		for (int i = num1; i <= num2; i++) {
			if (getArm(i)) {
				res += i + " ";
			}

		}
		return res;
	}

	public static boolean getArm(int num) {
		boolean b = false;
		int temp = num;
		int num2 = 0;

		while (num != 0) {
			int a = num % 10;
			num = num / 10;
			num2 = num2 + (a * a * a);
		}
		if (temp == num2) {
			b = true;
		}
		return b;
	}

}
