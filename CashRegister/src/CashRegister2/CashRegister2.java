package CashRegister2;

import java.util.ArrayList;

/**
 * A simulated cash register that tracks the item count and the total amount
 * due.
 */
public class CashRegister2 {
	private double totalAmount; // Instance variable to store the total amount owed
	private int itemCount; // Instance variable to store the count of items purchased
	private ArrayList<String> items; // Instance variable to store the names of items

	// Constructor to initialize the total amount and item count to 0
	public CashRegister2() {
		this.totalAmount = 0.0;
		this.itemCount = 0;
		this.items = new ArrayList<>();
	}

	/**
	 * Adds an item to this cash register.
	 * 
	 * @param price:   the price of this item
	 * @param itemName the name of this item
	 */
	// Method to add the price of an item to the total amount owed
	public void addItem(double price, String itemName) {
		if (price > 0 && itemName != null && !itemName.isEmpty()) {
			totalAmount += price;
			itemCount++;
			items.add(itemName);
			System.out.println("Item added: " + itemName + ". Current item count: " + itemCount);
		}
	}

	/**
	 * Gets the price of all items in the current sale.
	 * 
	 * @return the total price
	 */
	// Method to return the total amount owed
	public double getTotal() {
		return totalAmount;
	}

	// Method to return the count of items purchased
	public int getCount() {
		return itemCount;
	}

	/**
	 * Gets the names of all items purchased.
	 * 
	 * @return the list of item names
	 */
	public ArrayList<String> getItems() {
		return items;
	}

	/**
	 * Resets the total amount and item count for a new sale.
	 */
	public void clear() {
		totalAmount = 0.0;
		itemCount = 0;
		items.clear();
	}

	// Main method for testing
	public static void main(String[] args) {
		// Construct a CashRegister object
		CashRegister2 register1 = new CashRegister2();
		CashRegister2 register2 = new CashRegister2();
		// Invoke non-static methods of the object
		register1.addItem(1.95, "Soda");
		register1.addItem(3.50, "Sandwich");

		register2.addItem(4.25, "Book");
		register2.addItem(2.75, "Pen");

		System.out.println("Total Amount: $" + register1.getTotal());
		System.out.println("Total Items: " + register1.getCount());
		System.out.println("Total Amount: $" + register2.getTotal());
		System.out.println("Total Items: " + register2.getCount());
		// Clear the register for a new sale
		register1.clear();
		System.out.println("After clearing, Total Amount: $" + register1.getTotal());
		System.out.println("After clearing, Total Items: " + register1.getCount());

		register2.clear();
		System.out.println("After clearing, Total Amount: $" + register2.getTotal());
		System.out.println("After clearing, Total Items: " + register2.getCount());
	}
}

/*
 * // Accessor Methods (Getters) public double getTotal() { return totalAmount;
 * }
 * 
 * public int getCount() { return itemCount; }
 * 
 * // Mutator Methods (Setters) public void addItem(double price) { if (price >
 * 0) { totalAmount += price; itemCount++; }
 * 
 * public void clear() {totalAmount = 0.0; itemCount = 0; ) }
 */
