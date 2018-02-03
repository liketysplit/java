public class MyPatterns6 {
	public MyPatterns6() {
	}
	
	public void displayPatternI(int lines) {
			System.out.println("\n\tPattern I\n");
			for (int i = 1; i <= lines; i++){
				for (int j = 1; j <= i; j++){
					System.out.print (j + " " );
            }
				System.out.println();
			}
	}
 
 	public void displayPatternII (int lines) {
  		   System.out.println("\n\tPattern II\n");
			for (int i = lines; i >= 1; i--){
				for (int j = 1; j <= i; j++){
					System.out.print (j + " " );
            }
				System.out.println();
			}
   }

 	public void displayPatternIII (int lines) {
  		   System.out.println("\n\tPattern III\n");
          for (int i = lines; i>0; i--){
              for(int k = 1; k < i; k++)
                  System.out.print(" ");
              for(int j = i; j <= lines; j++)
                  System.out.print(j);
               
            
            System.out.println();
			}		
		
		
		System.out.println();
		
	}


	public void displayPatternIV (int lines) {
  		   System.out.println("\n\tPattern IV\n");
          for (int i = 1; i <= lines; i++){
              for(int k = lines; k > i; k--)
                  System.out.print(" ");
              for(int j = 1; j <= i; j++)
                  System.out.print(j);
          System.out.println();
          }
		
	}

	public void displayPatternV (int lines) {
  		   System.out.println("\n\tPattern V\n");
          for (int i = 1; i <= lines; i++){
              for(int k = lines; k > i; k--)
                  System.out.print(" ");
              for(int j = 1; j <= i; j++)
                  System.out.print(j);
          System.out.println();
          }	
										

		System.out.println();
		
	}

	public void displayPatternVI (int lines) {
  		System.out.println("\n\tMy Own Pattern to be implemented\n");
				
						

			System.out.println();
		
	}

}