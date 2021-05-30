package assignment_12_May17th;

import java.util.Scanner;

public class ECC36_Adder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First number and Second Number");
		System.out.println(getSum(scanner.nextInt(), scanner.nextInt()));
		scanner.close();
	}

	public static String getSum(int num1, int num2) {
		String res = "";
		if (num1 <= 0 || num2 <= 0) {
			res = "Error";
		} else {
			res =  num1 + num2+"";
		}
		return res;

	}

}
