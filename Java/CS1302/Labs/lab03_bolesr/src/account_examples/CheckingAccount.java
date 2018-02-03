package account_examples;

public class CheckingAccount {
	protected static final double TRANSACTION_FEE = 1.0;
	protected double balance;

	public CheckingAccount(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double amount) {
		balance -= (amount+TRANSACTION_FEE);
	}

	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public String toString() {
		return "Account balance=" + balance;
	}
}

