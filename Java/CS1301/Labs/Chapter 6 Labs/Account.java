//********************************************************************
// Purpose: Represents a bank account with basic services such as deposit
//          and withdraw.
//          Implement the Account Skeleton.
//          Save it under Account.java       
//Input:    None
//Output:   None
//Author:   Fares
//Date:     10/6/2016
//Class:    CS1301
//********************************************************************
import java.text.NumberFormat;
import java.util.*;

public class Account{
   //1.  Declarations 
   //name is of type String
   String name = "Empty";
   //acctNumber is of type long to hold a long account number
   long acctNumber = -99999;
   //balance is of type double
   double balance = -55555;
   //dateCreated is of type Date.
  	Date dateCreated = new Date();
	//Create a no-argument constructor
	//-----------------------------------------------------------------
   //2.  No-argument constructor:
   //    Sets up a default account. Set name to "Unknown", number to 999999,
	//    balance to 0, and get the date from the system
   //-----------------------------------------------------------------

   public Account (){
   String name = "Empty";
   long acctNumber = 99999;
   double balance = 0;
  	Date dateCreated = new Date();
   
   }
  
   //-----------------------------------------------------------------
   //3.  Overloaded constructor.
   //    It accepts owner's name, account number, and initial balance.
   //    Sets up the account by defining its owner, account number,
   //    and initial balance.
   //-----------------------------------------------------------------
   public Account (String owner, long account, double initial){
      //Assign the passed parameters to class variables above
      //Get the date from the system and save it in the instance variable
		//dateCreated declared above
      name = owner;
      acctNumber = account;
      balance = initial;
      dateCreated = new Date();

    }

   //-----------------------------------------------------------------
   //4.  getName (accessor):    Returns ownwer's name
   //-----------------------------------------------------------------
   public String getName(){
      
      return name;
   }
   
   //-----------------------------------------------------------------
   //5.  getAccountNumber (accessor):    Returns account number
   //-----------------------------------------------------------------
   public long getAccountNumber (){
         
      return acctNumber;

   }

   //-----------------------------------------------------------------
   //6.  Returns the current balance of the account.
   //-----------------------------------------------------------------
   public double getBalance (){

      return balance;  
   }

   //-----------------------------------------------------------------
   //7.  Updates name
   //-----------------------------------------------------------------
   public void setName (String newName){
      //Assign newName to name
      name = newName;
   }

   //-----------------------------------------------------------------
   //8.  Updates account number
   //-----------------------------------------------------------------
   public void setAccountNumber (long acctNumber){
      //Assign acctNumber to this.acctNumber
      this.acctNumber =  acctNumber;
   }

   //-----------------------------------------------------------------
   //9.  Deposits the specified amount into the account. 
   //-----------------------------------------------------------------
   public void deposit (double amount){
      //update balance balance = balance + amount;
      balance += amount;
   }

   //-----------------------------------------------------------------
   //10. Withdraws the specified amount from the account
   //-----------------------------------------------------------------
   public void withdraw (double amount){
      //update balance balance = balance - amount;
      balance -= amount;
   }
   //-----------------------------------------------------------------
   //11. Returns a one-line description of the account as a string.
   //-----------------------------------------------------------------
   public String toString (){
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      // return account information
      String result;
      result = "\n\tName is:\t" + name +
               "\n\tAccount Number:\t" + acctNumber +
               "\n\tBalance is:\t" + fmt.format(balance) +
               "\n\tdate Created:\t" + dateCreated;
      return result; 
   }
}