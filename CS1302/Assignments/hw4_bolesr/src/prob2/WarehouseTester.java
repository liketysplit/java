package prob2;

public class WarehouseTester {
	
	
	public static void main(String[] args) {
		
		Warehouse warehouse = new Warehouse();
		
		Item hat = new Item("Hat", 2.25);
		Item shirt = new Item("Shirt", 2.00);
		Item pants = new Item("Pants", 5.50);
		Item socks = new Item("Socks", 4.75);
		Item shoes = new Item("Shoes", 2.25);
		Item bookbag = new Item("Book Bag", 2.00);
		Item notebook = new Item("Note Book", 5.50);
		Item pen = new Item("Pen", 4.75);
		
		warehouse.addItem(hat);
		warehouse.addItem(shirt);
		warehouse.addItem(pants);
		warehouse.addItem(socks);
		warehouse.addItem(shoes);
		warehouse.addItem(bookbag);
		warehouse.addItem(notebook);
		warehouse.addItem(pen);
		
		RefrigeratedItem ham = new RefrigeratedItem("Pizza", 2.00, 25.00);
		RefrigeratedItem cheese = new RefrigeratedItem("Cheese", 4.75, 25.00);
		RefrigeratedItem yogurt = new RefrigeratedItem("Yogurt", 6.00, 25.00);
		RefrigeratedItem dinnerrolls = new RefrigeratedItem("Dinner Rolls", 1.25, 25.00);
		RefrigeratedItem cinnamonrolls = new RefrigeratedItem("Cinnamon Rolls", 1.25, 25.00);
		RefrigeratedItem grapes = new RefrigeratedItem("Grapes", 2.00, 25.00);
		RefrigeratedItem strawberries = new RefrigeratedItem("Strawberrries", 4.75, 25.00);
		RefrigeratedItem blueberries = new RefrigeratedItem("Blueberries", 6.00, 25.00);
		RefrigeratedItem sourcream = new RefrigeratedItem("Sour Cream", 1.25, 25.00);
		RefrigeratedItem creamcheese = new RefrigeratedItem("Cream Cheese", 1.25, 25.00);
		
		
		warehouse.addItem(ham);
		warehouse.addItem(cheese);
		warehouse.addItem(yogurt);
		warehouse.addItem(dinnerrolls);
		warehouse.addItem(cinnamonrolls);
		warehouse.addItem(strawberries);
		warehouse.addItem(blueberries);
		warehouse.addItem(creamcheese);
		
		System.out.print("\nTotal Inventory Count: \t" + warehouse.getNumItems());
		System.out.print("\nTotal Inventory Cost: \t" + warehouse.getTotalCost());
		System.out.print("\nTotal Refrigerated Inventory Cost: \t" + warehouse.getTotalCostRefrigerated());
		System.out.print("\n\nTotal Inventory: " + warehouse);
		System.out.print("\nRefrigerated Inventory: " + warehouse.getRefrigeratedItems());

}

}
