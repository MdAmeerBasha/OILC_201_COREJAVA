package assignment_19_june8th;

class InsufficientFundsException extends Exception {
	public InsufficientFundsException(String mess) {
		super(mess);
	}
}

public class CheckingAccount {
	int accountNo;
	double balance;

	public CheckingAccount(int accountNo, double balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}

	boolean checkAccount(int accountNo) {
		boolean b = false;
		if (accountNo == this.accountNo) {
			b = true;
		}
		return b;
	}

	void deposit(int accountNo, double amount) {
		if (checkAccount(accountNo)) {
			double after_deposit = balance + amount;
			System.out.println("after deposit the balance :" + after_deposit);
		} else {
			System.out.println("Invalid Account");
		}

	}

	double withdraw(int accountNo, double amount) {
		double res = 0;
		if (checkAccount(accountNo)) {
			try {
				if (amount > balance) {
					throw new InsufficientFundsException("Insufficient Amount in your Account");
				} else {
					res = balance - amount;
				}
			} catch (InsufficientFundsException e) {
				System.out.println(e.getMessage());
			}
		} else {
			System.out.println("Invalid Account Number");
		}
		return res;

	}

}
