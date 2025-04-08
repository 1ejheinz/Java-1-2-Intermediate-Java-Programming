package internationalCurrency;

import java.util.Arrays;
import java.util.List;

/**
 * @author Edward Heinz
 *         <p>
 *         International Currency
 *         <p>
 *         Lab6
 *         <p>
 *         EntryPoint contains the main() method. The second class will be
 *         called “Currency” and the Third will be "InternationalCurency" that
 *         uses inheritance and protected.
 */
public class Currency {
	private int amount;
	private String serialNumber;
	private static final List<Integer> VALID_DENOMINATIONS = Arrays.asList(1, 2, 5, 10, 20, 50, 100);

	/**
	 * Constructor for Currency
	 * 
	 * @param amount       The dollar amount
	 * @param serialNumber The currency's serial number
	 * @throws ArithmeticException
	 * @throws IllegalArgumentException
	 */
	public Currency(int amount, String serialNumber) {
		if (!VALID_DENOMINATIONS.contains(amount)) {
			throw new ArithmeticException("incorrect amount: " + amount);
		}
		if (!isValidSerialNumber(serialNumber)) {
			throw new IllegalArgumentException("invalid serial number: " + serialNumber);
		}

		this.amount = amount;
		this.serialNumber = serialNumber;
	}

	/**
	 * Validates the serial number format.
	 * 
	 * @param serialNumber The serial number to validate
	 * @return true if valid, false otherwise
	 */
	private boolean isValidSerialNumber(String serialNumber) {
		if (serialNumber.length() < 10 || serialNumber.length() > 11) {
			return false;
		}
		char firstChar = serialNumber.charAt(0);
		char lastChar = serialNumber.charAt(serialNumber.length() - 1);
		if (!Character.isLetter(firstChar) || !Character.isLetter(lastChar)) {
			return false;
		}
		for (int i = 1; i < serialNumber.length() - 1; i++) {
			if (!Character.isLetterOrDigit(serialNumber.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Provides access to the amount field (protected for inheritance use).
	 * 
	 * @return The dollar amount
	 */
	protected int getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return "$" + amount + ": " + serialNumber;
	}
}
