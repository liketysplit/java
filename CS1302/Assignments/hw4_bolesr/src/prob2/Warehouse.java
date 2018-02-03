package prob2;

import java.util.ArrayList;

public class Warehouse {
	
	private ArrayList<Item> items = new ArrayList<>();
	
	public Warehouse(){
		
	}
	
	public void addItem(Item item){
		items.add(item);	
	} 
	 
	public int getNumItems(){
		return items.size();
	} 
	
	public ArrayList<RefrigeratedItem> getRefrigeratedItems(){
		
		ArrayList<RefrigeratedItem> refrigerateditems = new ArrayList<>();
		
		for (Item i : items){
			if (i instanceof RefrigeratedItem)
				refrigerateditems.add((RefrigeratedItem) i);
		}
		
		
		return refrigerateditems;
	} 
		 
	public double getTotalCost(){
		
		double tempTotalCost = 0.0;
		int count = 0;
		
		for (Item i : items){
			tempTotalCost += items.get(count).cost();
			count ++;
		}
		
		return tempTotalCost;
	} 
	
	public double getTotalCostRefrigerated(){
		double tempTotalCostRefrigerated = 0.0;
		int count = 0;
		
		for (Item i : items){
			if (items.get(count) instanceof RefrigeratedItem)
			tempTotalCostRefrigerated += items.get(count).cost();
			count ++;
		}
		
		return tempTotalCostRefrigerated;
	} 
	
	public String toString(){
		StringBuilder ts = new StringBuilder();
		ts.append("\n");
		
		for (Item i : items){
		    ts.append(i);
		    
		}
		ts.append("\n");
		
		return ts.toString();
	} 
 
	 
	
	
	

}
