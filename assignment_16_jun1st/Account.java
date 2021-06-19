package assignment_16_jun1st;

import java.util.Scanner;

public class Account {
	Scanner scanner = new Scanner(System.in);
	private Customer customer;
	private int accountNo;
	private double balance;
	private float interstRate;

	public Account() {
		System.out.println("default constructor");
	}

	public Account(Customer customer, int accountNo, double balance, float interstRate) {
		this.customer = customer;
		this.accountNo = accountNo;
		this.balance = balance;
		this.interstRate = interstRate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public float getInterstRate() {
		return interstRate;
	}

	public void setInterstRate(float interstRate) {
		this.interstRate = interstRate;
	}

	@Override
	public String toString() {
		return "Account [customer=" + customer + ", accountNo=" + accountNo + ", balance=" + balance + ", interstRate="
				+ interstRate + "]";
	}

	public void deposit(double addAmount) {

		balance = balance + addAmount;
	}

	public void withdraw(double drawAmount) {

		if (drawAmount < balance) {
			balance = balance - drawAmount;
		} else {
			return;
		}

	}

}
