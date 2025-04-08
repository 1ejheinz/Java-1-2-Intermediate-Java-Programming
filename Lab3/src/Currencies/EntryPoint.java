package Currencies;

/**
 * @author Edward Heinz
 *         <p>
 *         Currencies
 *         <p>
 *         Lab3
 *         <p>
 *         EntryPoint contains the main() method. The second class will be
 *         called “Currency”.
 */
import java.util.Scanner;

public class EntryPoint {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			while (true) {
				System.out.print("Please enter a bill amount and serial number: ");
				String amountStr = scanner.next(); // Read amount as String
				String serialNumber = scanner.next();// Read serial number

				try {
					int amount = Integer.parseInt(amountStr);// Convert amount to integer

					if (amount == 0) {
						System.out.println("Done.");
						break; // Exit the loop if amount is 0
					}

					try {
						Currency currency = new Currency(amount, serialNumber);
						System.out.println(currency);
					} catch (ArithmeticException | IllegalArgumentException e) {
						System.out.println(e.getMessage());
					}

				} catch (NumberFormatException e) {
					System.out.println("java.lang.NumberFormatException: For input string: \"" + amountStr + "\"");
					e.printStackTrace(); // Print stack trace for debugging
				}
			}
		} finally {
			scanner.close(); // Ensure the scanner is closed
			System.out.println("Scanner resource has been closed.");
		}
	}
}
