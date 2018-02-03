package prob1;

public class CheckingAccount {
	
	protected double balance;
	protected int id;
	protected boolean isLowBalance;
	protected int numWithdrawals;
	protected String lowBal = "False";
	
	public CheckingAccount(int id, double bal){
		this.id = id;
		this.balance = bal;
	}
	public void depoist(double amount){
		balance += amount;
	}
	public void endOfMonth(){

		numWithdrawals=0;
		if(isLowBalance)
			balance -= 10.0;
		
		else
			isLowBalance = false;
		
		if (balance < 0.0)
			balance -= 20.0;
	}
	public double getBalance(){
		return balance;
	}
	public int getId(){
		return id;
	}
	public int getNumWithdrawals(){
		return numWithdrawals;
	}
	public void withdraw(double amount){
		balance -= amount;
		numWithdrawals++;
		
		if (numWithdrawals >3)
			balance -=2.0;
		
		if (balance < 100.0){
			isLowBalance = true;
			lowBal = "True";
		}

	}
	public String toString(){
		
		return String.format("\nChecking Account ID: %d "
						   + "Balance: %.2f, "
						   + "Low Balance: %S, "
						   + "Number of Withdrawals: %d ", 
						   id, balance, lowBal, numWithdrawals);
				
	}
	

}
