package assignment_16_jun1st;

import java.util.Scanner;

public class AccountMainClass {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the First Name, Last Name, Account no, balance ,interest");
		Customer cust=new Customer(scanner.next(),scanner.next());
		Account acc=new Account(cust, scanner.nextInt(), scanner.nextDouble(), scanner.nextFloat());
		System.out.println("Enter the amount to deposite in Account");
		acc.deposit(scanner.nextDouble());
		System.out.println("Enter the amount to withdraw from Account");
		acc.withdraw(scanner.nextDouble());
		System.out.println(acc);
		scanner.close();
	}

}
