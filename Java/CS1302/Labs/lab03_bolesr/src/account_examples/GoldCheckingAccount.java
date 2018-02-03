package account_examples;

public class GoldCheckingAccount extends CheckingAccount {
	double threshold;

	public GoldCheckingAccount(double bal, double threshold) {
		super(bal);
		this.threshold = threshold;
	}

	public void withdraw(double amount) {
		if(balance >= threshold) {
			balance -= amount;
		}
		else {
			balance -= (amount + TRANSACTION_FEE);
		}
	}

}