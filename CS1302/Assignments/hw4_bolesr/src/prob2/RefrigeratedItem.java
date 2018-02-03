package prob2;

public class RefrigeratedItem extends Item{
	
	
	protected double temp; 
	public RefrigeratedItem( String name, double weight, double temp) {
		super(name,weight);
		this.temp = temp;
	}
	
	public RefrigeratedItem( Item item, double temp){
		super(item.name,item.weight);
		this.temp = temp;
	} 
	
	public double cost(){
		return (2.0 * weight) + ((100-temp)*0.1);
	} 
	
	public double getTemp(){
		return temp;
	} 
	
	public String toString(){
		return String.format("\nName: %s, Cost: $%.2f, Weight: %.2f, Temperature: %.2f degrees"
							, name, cost(), weight, temp);
	}

}
