package prob2;

public class Item {
	
	 protected String name; 
	 protected double weight; 
	 
	  public Item(String name, double weight){
		  this.name = name;
		  this.weight = weight;
		  
	  } 
	  
	  public double cost(){
		  return 2.0 * weight;
	  } 
	  
	  public String getName(){
		  return name;
	  } 
	  
	  public double getWeight(){
		  return weight;
	  } 
	  
	  public String toString(){
		  return String.format("\nName: %s, Cost: $%.2f, Weight: %.2f"
					, name, cost(), weight);
	  }

}
