package prob1;

public class AccountTester {
	
	public static void main(String[]args){
		
		//Test Checking Account 1 (LowBalance && EoM)
		CheckingAccount nca = new CheckingAccount(1,500.00);
		
		for (int i = 0; i <= 12; i++){
		
		nca.withdraw(50);
		System.out.println("Withdrawal:" + (i+1));
		System.out.println(nca.toString());
		}
		System.out.println("Deposit: 1");
		nca.depoist(500);
		
		System.out.println(nca.toString());
		
		nca.endOfMonth();
		System.out.println("End of Month");
		System.out.println(nca.toString());
		
		//Test Gold Checking Account 1 (LowBalance && EoM)
		
		GoldCheckingAccount ngca = new GoldCheckingAccount(2,1500.00);
		
		for (int i = 0; i <= 14; i++){
		
		ngca.withdraw(100);
		System.out.println("Withdrawal:" + (i+1));
		System.out.println(ngca.toString());
		}
		
		System.out.println("Deposit: 1");
		ngca.depoist(1500);
		
		System.out.println(ngca.toString());
		
		ngca.endOfMonth();
		System.out.println("End of Month");
		System.out.println(ngca.toString());
		
		//Test Gold Checking Account 2 (Interest)
		
		GoldCheckingAccount ngca2 = new GoldCheckingAccount(2,1500.00);
		
		ngca2.endOfMonth();
		System.out.println("End of Month");
		System.out.println(ngca2.toString());
	}
	
	public AccountTester(){
		
	}

}
