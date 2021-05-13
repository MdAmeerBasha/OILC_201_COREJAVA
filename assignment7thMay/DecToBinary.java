package assignment7thMay;

import java.util.Scanner;

public class DecToBinary {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the Decemal Number to convert into binary number");
		System.out.println(getBinary(scanner.nextInt()));
		scanner.close();
	}

	public static String getBinary(int num) {
		String res = "";
		int[] binaryNum = new int[1000];
		int i = 0;
		while (num > 0) {

			binaryNum[i] = num % 2;
			num = num / 2;
			i++;
		}

		for (int j = i - 1; j >= 0; j--)
			res += "" + (binaryNum[j]);

		return res;
	}

}
