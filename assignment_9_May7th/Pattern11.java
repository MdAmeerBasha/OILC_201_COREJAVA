package assignment_9_May7th;

import java.util.Scanner;

public class Pattern11 {
	public static void main(String args[]) {
		int space, rows;
		int num = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows you want ");
		rows = scanner.nextInt();
		System.out.println(rows);

		for (int i = 0; i < rows; i++) {
			for (space = 1; space <= rows - i; space++)
				System.out.print(" ");

			for (int j = 0; j <= i; j++) {
				if (j == 0 || i == 0)
					num = 1;
				else
					num = num * (i - j + 1) / j;

				System.out.print(num + " ");
			}
			System.out.println("\n");
		}
		scanner.close();
	}

}
