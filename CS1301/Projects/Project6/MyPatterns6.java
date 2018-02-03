public class MyPatterns6 {
	public MyPatterns6() {
	}
	
	public void displayPatternI(int lines) {
			System.out.println("\n\tPattern I\n");
			for (int i = 1; i <= lines; i++){    // Allows for any amonut of iterations
				for (int j = 1; j <= i; j++){     //Increments the max value by one and displays the numbers between 1 and max value
					System.out.print (j);
            }
			System.out.println();
			}
	}
 
 	public void displayPatternII (int lines) {
  		   System.out.println("\n\tPattern II\n");
			for (int i = lines; i >= 1; i--){  // Allows for any amonut of iterations
				for (int j = 1; j <= i; j++){   // Prints out the sequence incrementing from 1 to lines and decrementing the largest value each iteration
					System.out.print (j);
            }
			System.out.println();
			}
   }

 	public void displayPatternIII (int lines) {
  		   System.out.println("\n\tPattern III\n");
          for (int i = lines; i>0; i--){      // Allows for any amonut of iterations
              for(int k = 1; k < i; k++)      //Prints a space to move the numbers to the right
                  System.out.print(" ");     
              for(int j = i; j <= lines; j++) //Prints highest number in the sequence; moves down in value and adds to the left
                  System.out.print(j);
               System.out.println();
			 }			
		   System.out.println();
	}


	public void displayPatternIV (int lines) {
  		   System.out.println("\n\tPattern IV\n");
          for (int i = 1; i <= lines; i++){   // Allows for for any amonut of iterations
              for(int k = lines; k > i; k--)  //Prints a space to move the numbers to the right
                  System.out.print(" ");      
              for(int j = 1; j <= i; j++)     //Prints the lowest number in the sequence; moves up in value then pushes to the left
                  System.out.print(j);
          System.out.println();
          }
		
	}

	public void displayPatternV (int lines) {
  		   System.out.println("\n\tPattern V\n");
          for (int i = 1; i <= lines; i++){   // Allows for for any amonut of iterations
              for(int k = 1; k < i ; k++)     //Prints a space to move the numbers to the right
                  System.out.print(" ");
              for(int j = i; j <= lines; j++) // Prints 1-lines(j) without surpasing lines
                  System.out.print(j); 
          
              for (int l=lines-1; l>=i; l--)
             
                     System.out.print(l);
                     System.out.println();
              
          }
                     
                                                       											
		System.out.println();
		
	}

	public void displayPatternVI (int lines) {
  		   System.out.println("\n\tPattern VI (Custom)\n"); // Combined patterns 3 & 5 and made a small adjustment to make a diamond shape
           for (int i = lines; i>0; i--){
              for(int k = 1; k < i; k++)
                  System.out.print(" ");
              for(int j = i; j <= lines; j++)
                  System.out.print(j);
              for (int l=lines-1; l>=i; l--)
             
                     System.out.print(l);
                     System.out.println();
              }   
          for (int i = 1; i <= lines; i++){
              for(int k = 1; k < i ; k++)
                  System.out.print(" ");
              for(int j = i; j <= lines; j++)
                  System.out.print(j); 
          
              for (int l=lines-1; l>=i; l--)
             
                     System.out.print(l);
                     System.out.println();
              
          }
                     
                                                       											
		System.out.println();
		
	}


}