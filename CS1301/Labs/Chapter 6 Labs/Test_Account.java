//********************************************************************
//  Test_Account.java       
//
//  Demonstrates the creation and use of multiple Account objects.
//********************************************************************
//
//Modify class to create objects with name and account number
//********************************************************************

public class Test_Account
{
   //-----------------------------------------------------------------
   //  Creates some bank accounts and requests various services.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      Account acct0 = new Account("Jeb", 0, 0);
      Account acct1 = new Account("Ted Murphy", 72354, 102.56);
      Account acct2 = new Account("Jane Smith", 69713, 40.00);
      Account acct3 = new Account("Edward Demsey", 93757, 759.32);
		Account acct4 = new Account("John Smith", 12345, 250);
      Account acct5 = new Account("Rick Boles", 54321, 520);
     
      acct1.deposit(25.85);
      System.out.println("\tAccount1 balance after deposit: " + acct1.getBalance());

      acct2.deposit(500.00);
      System.out.println("\tAccount2 balance after deposit: " + acct2.getBalance());
      
      acct2.withdraw (430.75);
      System.out.println("\tAccount2 balance after withdrawal: " + acct2.getBalance ());

      System.out.println();
      
      System.out.println(acct0);
      System.out.println(acct1);
      System.out.println(acct2);
      System.out.println(acct3);
		System.out.println(acct4);
      System.out.println(acct5);
      
      //Use other methods in Account class
      //1. Change name of acct0
      //2. Display acct0 information
      //3. Change the account number for acct0
      //4. Deposit 100 into acct0
      //5. Display acct0
      
      acct0.setName("Bob");
      System.out.println(acct0);
      acct0.setAccountNumber(654321);
      acct0.deposit(100);
      System.out.println(acct0);
      
   }
}
