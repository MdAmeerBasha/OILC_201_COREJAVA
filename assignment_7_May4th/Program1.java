package assignment_7_May4th;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scanner.nextInt();
		String res = " ";
		switch (num % 2) {
		case 0:
			res = num + " is even number";
			break;
		case 1:
			res = num + " is odd number";
			break;
		}
		System.out.println(res);
		scanner.close();

	}

}
