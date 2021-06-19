package assignment_19_june8th;

import java.util.Scanner;

public class CheckingAmountMainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the account No and Amount");
		CheckingAccount c1 = new CheckingAccount(scanner.nextInt(), scanner.nextDouble());
		System.out.println("choose the option to do banking process \n 1.Deposit \n 2.withdraw \n 3.Exit");
		int choose = scanner.nextInt();
		switch (choose) {
		case 1:
			System.out.println("Enter the Account No and Amount to Deposite Money");
			c1.deposit(scanner.nextInt(), scanner.nextDouble());
			break;
		case 2:
			System.out.println("Enter the Account No and money to withdraw Money");
			System.out.println(c1.withdraw(scanner.nextInt(), scanner.nextDouble()));
			break;
		case 3:
			System.exit(0);
		}
		scanner.close();

	}
}
