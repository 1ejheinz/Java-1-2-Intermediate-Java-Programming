
package CashRegister2;

public class CashRegister2Test {

	public static void main(String[] args) {
		// Create an instance of CashRegister2
		CashRegister2 register = new CashRegister2();

		// Test 1: Adding items to the register
		System.out.println("Test 1: Adding items");
		register.addItem(2.99, "Milk");
		register.addItem(1.49, "Bread");
		register.addItem(3.50, "Butter");

		// Check the total amount and item count
		System.out.println("Expected Total Amount: $7.98");
		System.out.println("Actual Total Amount: $" + register.getTotal());
		System.out.println("Expected Item Count: 3");
		System.out.println("Actual Item Count: " + register.getCount());

		// Test 2: Checking items in the register
		System.out.println("\nTest 2: Checking items");
		System.out.println("Items purchased: " + register.getItems());

		// Test 3: Clearing the register
		System.out.println("\nTest 3: Clearing the register");
		register.clear();

		// Check the total amount and item count after clearing
		System.out.println("Expected Total Amount after clearing: $0.0");
		System.out.println("Actual Total Amount after clearing: $" + register.getTotal());
		System.out.println("Expected Item Count after clearing: 0");
		System.out.println("Actual Item Count after clearing: " + register.getCount());
	}
}
