import java.util.Date;

public class MyPassword7{

   private boolean rule1; //A password must have at least eight characters
   private boolean rule2; //A password consists of only letters and digits
   private boolean rule3; //A password must contain at least three digits
   String password;
   
   /*************************
    No-Argument Constructor
   *************************/
   public MyPassword7() {
   
   }//End of constructor
   
   //*************************
   //verifyPassword7: Receives password, assigns it to the instance variable, and invokes the four supporting methods below.
   /************************************************************
   Constructor verifyPassword7 - Receives:
   
                  pw and assigns it to password
                  
   Constructor verifyPassword7 - Invokes:
   
                  verifyLength
                  verifyValidCharacters
                  verifyNumberOfDigits
                  printReport
                  
   ************************************************************/
   
   public void verifyPassword7(String pw) {
      password = pw;
      rule1 = verifyLength();
      rule2 = verifyValidCharacters();
      rule3 = verifyNumberOfDigits();
      printReport();
      
   }//End of constructor
   

   /************************************************************
   Constructor verifyLength - Returns:
   
                  true/false based on length of password

   ************************************************************/
   
   private boolean verifyLength() {

      boolean test1 = true;      
      if (password.length() < 8)
         test1 = false;
      else if ( password.length() >= 8)
         test1 = true;
         
      return test1;
   }//End of verifyLength
   

   /************************************************************
   Constructor verifyValidCharacters - Returns:
   
                  true/false based on valid/invalid characters

   ************************************************************/
   
   private boolean verifyValidCharacters() {
   
      boolean test2 = true;
      int letters = 0;
      int digits = 0;
      int lastChar = password.length()-1;
      
      for (int i = 0; i <= lastChar; i++){
      
          char index = password.charAt(i);
          
            if (Character.isDigit(index))
               digits++;
            else if (Character.isLetter(index))
               letters++;
      }
      
      if (password.length() > letters + digits)
         test2 = false;
      else if (password.length() == letters + digits)
         test2 = true;
            
      return test2;   
            
   }//End of verifyValidCharacters
   

   /************************************************************
   Constructor verifyNumberOfDigits - Returns:
   
                           true/false based on number of digits

   ************************************************************/
   
   private boolean verifyNumberOfDigits() {
      
      boolean test3 = true;
      int digits = 0;
      int lastChar = password.length()-1;
        
      for (int i = 0; i <= lastChar; i++){
         
         char index = password.charAt(i);
         if (Character.isDigit(index))
               digits++;
      }  
      if (digits >= 3)
         test3 = true;
      else if (digits < 3)
         test3 = false;
         
      return test3;
      
        
   }//End of verifyNumberOfDigits
   
   /************************************************************
   Constructor printReport - Outputs:
                               Successful passowrd notifications
                                             or
                               Explantation of incorrect entry
   ************************************************************/
   
   private void printReport() {
   
      System.out.println("\n\tPassword Entered:\t" + password );
   
      if (rule1 == true && rule2 == true && rule3 == true)
         System.out.println("\n\tCongratulations! The password you entered is valid!");
      else {
         System.out.println("\n\tSorry the password is not valid for the following reason(s):");
         int i = 1;
         
            if (!rule1){
               //System.out.print("\t" + i + ".");
               System.out.printf("\n\t\t%-1s%-30s",i,". Violates rule1: the password does not have at least eight characters");
               i+=1;}
            if (!rule2){
               //System.out.print("\t" + i + ".");
               System.out.printf("\n\t\t%-1s%-30s",i,". Violates rule2: the password does not consist of only letters and digits");
               i+=1;}
            if (!rule3){
               //System.out.print("\t" + i + ".");
               System.out.printf("\n\t\t%-1s%-30s",i,". Violates rule3: the password does not contain at least two digits");}
               

           }
               System.out.printf("\n\n\t%-20s","*************************************************************************************");
   }//End of printReport 
   
   /************************************************************
   Constructor printHeader - Outputs:
                                 name
                                 course
                                 date
                                 
   Constructor printHeader - Receives:
                                 nm, cs and stores them in
                                 name and course respectively                               
   ************************************************************/   
   public void printHeader(String nm, String cs){
   
      String name = nm;
      String course = cs; 
      Date dateCreated = new Date();
   
      System.out.printf("\n\t%-20s","********************MyPassword7 Report***********************************************");
      System.out.printf("\n\t%-10s%-15s","Name:",name);
      System.out.printf("\n\t%-10s%-15s","Course:",course);
      System.out.printf("\n\t%-10s%-15s","Date",dateCreated);
      System.out.printf("\n\t%-20s","*************************************************************************************\n");
   
   } //End of printHeader          
   
}