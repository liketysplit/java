//******************
//
//******************
public class Television_Skeleton{
   //declarations
   //manufacturer, screenSize, powerOn, channel, and volume
     
   //************************
   //Constructor:Assigns manufacturer and screenSize to manufacturer and screen size
   //             Assign powerOn to false, volume to 20, and channel to 2
   //************************
   public Television_Skeleton (String manufacturer, int screenSize){
      System.out.println ("\tTo be implemented");
   }
   
   //***********************
   //getVolume accessor:   returns the volume
   //***********************
   public int getVolume(){
      System.out.println ("\tTo be implemented");

      return -1;
   }

   //***********************
   //getChannel accessor:   returns the channel
   //***********************
   public int getChannel(){
      System.out.println ("\tTo be implemented");

      return -2;
   }
   
   //***********************
   //getManufacturer accessor:   returns the manufacutrer
   //***********************
   public String getManufacturer(){
      System.out.println ("\tTo be implemented");

      return "M";
   }
   
   //***********************
   //getPower accessor:   returns the power
   //***********************
   public boolean getPower(){
      System.out.println ("\tTo be implemented");

      return false;
   }

   
   //***********************
   //getScreenSize accessor:   returns the screen size
   //***********************
   public int getScreenSize(){
      System.out.println ("\tTo be implemented");

      return -4;
   }
   
   //***********************
   //setChannel mutator:   updates the channel
   //***********************
   public void setChannel(int newChannel){
      System.out.println ("\tTo be implemented");

   }
   
   //***********************
   //power mutator:   switch the power
   //***********************
   public void power(){
      System.out.println ("\tTo be implemented");

   }
   
   //***********************
   //increaseVolume mutator:   increases volume by 1
   //***********************
   public void increaseVolume(){
      System.out.println ("\tTo be implemented");

   }
   
   //***********************
   //decreaseVolume mutator:   decreases volume by 1
   //***********************
   public void decreaseVolume(){
      System.out.println ("\tTo be implemented");
   }
   
   //***********************
   //toString
   //***********************
   public String toString(){
      System.out.println ("\tTo be implemented");
      return "toString";
   }
}