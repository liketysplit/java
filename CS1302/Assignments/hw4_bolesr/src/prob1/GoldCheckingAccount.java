package prob1;

public class GoldCheckingAccount extends CheckingAccount {

	public GoldCheckingAccount(int id, double bal){
		super(id, bal);
		
	}
	
	@Override
	public void endOfMonth(){
		numWithdrawals=0;
		if(isLowBalance)
			balance -= 25.0;
		
		else{
			isLowBalance = false;
			balance = balance + (balance * 0.01);
		}
		
		if (balance < 0.0)
			balance -= 20.0;
		
	}
	
	public void withdraw(double amount){
		balance -= amount;
		numWithdrawals++;
		
		if (balance < 1000.0){
			isLowBalance = true;
			lowBal = "True";
		}

	}
	@Override
	public String toString(){
		
		return String.format("\nGold Checking Account ID: %d "
				   + "Balance: %.2f, "
				   + "Low Balance: %S, "
				   + "Number of Withdrawals: %d\n", 
				   id, balance, lowBal, numWithdrawals);
				
	}
	
}
