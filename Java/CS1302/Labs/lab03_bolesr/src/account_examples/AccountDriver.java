package account_examples;

public class AccountDriver {
	public static void main(String[] args) {
		CheckingAccount a = new CheckingAccount(100.0);
		a.deposit(200.0);
		a.withdraw(50.0);
		System.out.println(a);
		CheckingAccount ca = new GoldCheckingAccount(100.0, 200.0);
		ca.withdraw(50.0);
		System.out.println(ca);
		ca.deposit(300.0);
		System.out.println(ca);
		ca.withdraw(50.0);
		System.out.println(ca);


	}

}
