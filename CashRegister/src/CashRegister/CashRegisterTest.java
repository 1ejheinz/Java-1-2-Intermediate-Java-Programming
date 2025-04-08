package CashRegister;

public class CashRegisterTest {
	public static void main(String[] args) {
		CashRegister register = new CashRegister();

		// Adding items to the register
		register.addItem(2.99);
		register.addItem(1.49);
		register.addItem(5.99);

		// Printing total price and item count
		System.out.println("Total price: " + register.getTotal()); // Expected output: 10.47
		System.out.println("Item count: " + register.getCount()); // Expected output: 3

		// Clearing the register
		register.clear();

		// Printing total price and item count after clearing
		System.out.println("Total price after clearing: " + register.getTotal()); // Expected output: 0.0
		System.out.println("Item count after clearing: " + register.getCount()); // Expected output: 0
	}
}
