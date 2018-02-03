/************************************************************
Purpose:  Input a string array from a data file. Store, Sort and Manipulate data contained within
Input:    data10.txt

Output:   Array All Tokens, Array Alpha Tokens, Array Alpha Tokens Sorted, Longest Value in Array, Shortest Value in Array

Author:   Rick Boles

Date:     11/08/2016

Course:   CS1301 A

Program:  ProcessTokens10.java
************************************************************/
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class ProcessTokens10{
   public ProcessTokens10(){
   
   }
   //*************************************************************************
   //selectOriginalTokens: Receives the input file and an empty array
   //                      to hold all tokens that have length greater than 0
   //                      at the end returns the number of tokens found in file
   //*************************************************************************
   public int selectOriginalTokens (Scanner scan, String [] list){
   
       int count = 0;
       while(scan.hasNext()){
       String line = scan.nextLine();
       String[] t = line.split("[ \n\t\r.,:?)({}\\[\\]]");
         for (int i = 0; i < t.length; i++){
         String item = t[i].trim();
            if(item.length() > 0){
            list[count] = item;
            count++;
            }//End if statement
         }//End for loop
       }//End while loop
      
      return count;
   }//end of method
   
   //*************************************************************************
   //displayList:    Receives the an array, number of used entries, and a 
   //                message.
   //                It displays the message, and all items in array with
   //                item number.
   //*************************************************************************
   public void displayList (String [] list, int count, String message){
   
        //Print utiliy
        System.out.println("\n\t" + message);
        for (int i = 0; i < count; i++){
           System.out.println("\t" + (i+1) + "\t" + list[i]);
        }//End for loop
      
   }//end of method
   
   //*************************************************************************
   //selectWordTokens:    Receives all tokens, number of tokens, and
   //                an empty array to hold only the alphabetic tokens.
   //                The method returns the number words found 
   //                We use the "[A-Za-z]+" with the String method matches 
   //                to filter only the tokens that have upper case and 
   //                lower case letters.
   //*************************************************************************
   public int selectWordTokens (String [] list1, int count1, String [] list2){
      
      int count = 0;
      
      //Runs through each value of list1 grabs the values that align with "[A-Za-z]+" and assigns them to list2
      for (int i = 0; i < count1 ; i++){
         if (list1[i].matches("[A-Za-z]+")){
            String Str = list1[i]; 
            list2[count]= Str;            
            count++;
         }//End if statement
      }//End for loop
      
      return count;
      
   }//end of method
   
   //*************************************************************************
   //sortWordTokens:    Receives allWords tokens and the number of words.
   //                To help with the sorting do the following:
   //                1. create a new array with the number of words (count). 
   //                2. copy the words in allWords to temp.
   //                3. Use the java Arrays.sort to sort temp
   //                4. Copy the sorted words in temp back to list
   //*************************************************************************
   public void sortWordTokens (String [] list, int count){
       
      String[] sortedWordsCopy = new String[count];
     
    
      //Makes a copy of list and stores it in sortedWordsCopy
      for (int i = 0; i < count; i++)
         sortedWordsCopy[i] = list[i];
         
      //Sorts sortedWordsCopy which is a copy of list
      Arrays.sort(sortedWordsCopy);
      
      //Copies the sorted list back out to list
      for (int i = 0; i < count; i++)
         list[i] = sortedWordsCopy[i];
   
   }//end of method
   
   //*************************************************************************
   //removeDuplicateWords:    Receives allWords(sorted) tokens and the number 
   //                of words and an empty array to hold the unique words.
   //                At the end return the number of unique words found.
   //                We need do the following:
   //                1. Assign first word to previous
   //                2. increament count by 1
   //                3. Assign previous to list2
   //                4. Skip current word if is the same as previous 
   //                5. Assign current to list2 if different than previous and 
   //                   assign current to previous.
   //*************************************************************************
   public int removeDuplicateWords (String [] list1, int count1, String [] list2){
        
      String lValue = list1[0];
      list2[0] = lValue;
      int count = 1;
      
      //Checks all words if the current value matches and stores only unique values
      for (int i = 0; i < count1; i++){
         String cValue = list1[i];
         if (!cValue.equals(lValue)){
            list2[count] = cValue;
            lValue = cValue;
            count++;
         }
      }//End for loop
      
      return count;
      
   }//end of method
   
   //*************************************************************************
   //longestItemInList:    Receives the unique list and number of 
   //                unique words in it.
   //                We need do the following:
   //                1. Assign first word to longest
   //                2. go through the list and compare the length of
   //                   current word with longest. If current length is greater,
   //                   update longest.
   //                3. At the end return longest  
   //*************************************************************************
   public String longestItemInList (String [] list, int count){
      
      String longestWord = list[0];
      
      for(int i = 0; i < count; i++){
      
          if (list[i].length() > longestWord.length())
               longestWord = list[i];
               
      }//End for loop
      
      return longestWord;
   }//end of method
   
   //*************************************************************************
   //shortestItemInList:    Receives the unique list and number of 
   //                unique words in it.
   //                We need do the following:
   //                1. Assign first word to shortest
   //                2. go through the list and compare the length of
   //                   current word with shortest. If current length is less,
   //                   update shortest.
   //                3. At the end return shortest  
   //*************************************************************************
   public String shortestItemInList (String [] list, int count){
      
      String shortestWord = list[0];
      
      for(int i = 0; i < count; i++){
      
          if (list[i].length() < shortestWord.length())
               shortestWord = list[i];
               
      }//End for loop
      
      return shortestWord;   
   }//end of method

}//end of class