package assignment7thMay;

import java.util.Scanner;

public class SumOfFactors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		System.out.println(getSumFact(scanner.nextInt()));
		scanner.close();
	}

	public static int getSumFact(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				sum += sum + i;
			}
		}
		return sum;
	}

}
