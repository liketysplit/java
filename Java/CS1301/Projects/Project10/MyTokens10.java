//*****************************************************************************
//Purpose:  Display words in ascending alphabetical order.
//          Write a program that reads words from a text file and displays 
//          all words (duplicates allowed)in ascending alphabetical order. 
//          The text file is passed as a command-line argument.
//          Use the following delimiters with String split method with
//          "[ \n\t\r.,:?)({}\\[\\]]" to split tokens.
//          Use the String matches method to select the tokens that 
//          start with a letter.
//*****************************************************************************
import java.util.*;
import java.io.*;
import java.util.*;

public class MyTokens10{
  public static void main(String[] args)throws IOException {
      if (args.length != 1) {
         System.out.println(
         "Invalid number of arguments in the Command-line");
         System.exit(1);
      }
      //Assume that the files can have up to 200 tokens
      String [] allTokens = new String [200];
      String [] allWords = new String [200];
      String [] sortedWords = new String [200];
      String [] uniqueWords = new String [200];
      
      int allTokensCount = 0;
      int allWordsCount = 0;
      int sortedWordsCount = 0;
      int uniqueWordsCount = 0;

      
      String filename = args[0];

      try {
         Scanner in = new Scanner(new File(filename));
         ProcessTokens10 pt = new ProcessTokens10();
      
         //Select original tokens
         allTokensCount = pt.selectOriginalTokens(in, allTokens);
         
         //Display original tokens
         pt.displayList(allTokens, allTokensCount, "Original Token List");
         
         //Select only the tokens that start with a letter
         allWordsCount = pt.selectWordTokens(allTokens, allTokensCount, allWords);
         
         //Display only the tokens that start with a letter
         pt.displayList(allWords, allWordsCount, "Original word list");
         
         //Sort the word tokens
         pt.sortWordTokens(allWords, allWordsCount);
         
         //Display the sorted word tokens
         pt.displayList(allWords, allWordsCount, "Sorted words");
         
         //Remove duplicates words
         uniqueWordsCount = pt.removeDuplicateWords(allWords, allWordsCount, uniqueWords);
         
         //Display the unique words
         pt.displayList(uniqueWords, uniqueWordsCount, "Unique words");
         
         //Display the longest item in allTokens list
         System.out.println ("\n\n\tThe longest item in allTokens list is:  \t" + pt.longestItemInList(allTokens, allTokensCount));
         
          //Display the shortest item in uniqueWords list
         System.out.println ("\n\n\tThe shortest item in uniqueWords list is:\t" + pt.shortestItemInList(uniqueWords, uniqueWordsCount));

                  
       }
       catch (Exception ex) {
         System.err.println(ex);
    }    
  }
}
