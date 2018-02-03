/************************************************************
   Purpose: Write a program to act as a remote
   Author:  Rick Boles
   Class:   CS1301
   Date:    12 OCT 2016
 ************************************************************/


public class Television{
   private final String MANUFACTURER;
   private final int SCREEN_SIZE;
   private boolean powerOn;
   private int channel;
   private int volume;

   //*************************************************************************
   //The setChannel method will store the desired station in the channel field.
   //*************************************************************************   
   public Television(String x, int y){
   
      MANUFACTURER = x;
      SCREEN_SIZE = y;  
      powerOn = false;
      channel = 2;
      volume = 20;
   }
   //*************************************************************************
   //The setChannel method will store the desired station in the channel field.
   //*************************************************************************   
   public void setChannel(int station){  
   
      channel = station;
   
   }
   
   //*************************************************************************
   //The power method will toggle the power between on and off, changing the value stored in the powerOn field from true to false or from false to true.
   //*************************************************************************
   public void power(){  
   
      powerOn = !powerOn;
   
   }
   
   
   //*************************************************************************
   //The getPower method will return the value in the PowerOn field.
   //*************************************************************************
   public boolean getPower(){  
      
      return powerOn;
      
   }
   
   //*************************************************************************
   //The increaseVolume method will increase the value stored in the volume field by 1.
   //*************************************************************************
   public void increaseVolume(){ 
   
      volume++; 
      
   }
   
   //*************************************************************************
   //The decreaseVolume method will decrease the value stored in the volume field by 1.
   //*************************************************************************
   public void decreaseVolume(){  
   
      volume--;
   
   }
   
   //*************************************************************************
   //The getChannel method will return the value stored in the channel field.
   //*************************************************************************
   public int getChannel(){  
      return channel;
   }
   //*************************************************************************
   //The getVolume method will return the value stored in the volume field.
   //*************************************************************************
   public int getVolume(){  
   
      return volume;
   
   }
   
   //*************************************************************************
   //The getManufacturer method will return the constant value stored in the MANUFACTURER field.
   //*************************************************************************
   public String getManufacturer(){ 
    
      return MANUFACTURER;
      
   }
   
   //*************************************************************************
   //The getScreenSize method will return the constant value stored in the SCREEN_SIZE field.
   //*************************************************************************
   public int getScreenSize(){  
    
      return SCREEN_SIZE;
   }
   
   //*************************************************************************
   //
   //*************************************************************************
   public String toString(){
   
      String result = "\n\tManufacturer:   \t" + MANUFACTURER + 
                      "\n\tScreen Size:    \t" + SCREEN_SIZE + 
                      "\n\tPower State:    \t" + powerOn + 
                      "\n\tChannel:        \t" + channel + 
                      "\n\tVolume:         \t" + volume;
      return result;

   }

}