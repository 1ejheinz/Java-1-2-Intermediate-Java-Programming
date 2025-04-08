package comparableInterface;

import java.util.Arrays;
import java.util.List;

/**
 * @author Edward Heinz
 *         <p>
 *         ComparableInterface
 *         <p>
 *         Lab8
 *         <p>
 *         EntryPoint contains the main() method. The second class will be
 *         called “Currency” and implements Comparable<Currency>
 */
public class Currency implements Comparable<Currency> {
	private int amount; // Currency amount
	private String serialNumber; // Unique serial number
	private static final List<Integer> VALID_DENOMINATIONS = Arrays.asList(1, 2, 5, 10, 20, 50, 100);

	/**
	 * Constructor for Currency
	 * 
	 * @param amount       The monetary value
	 * @param serialNumber The unique serial number
	 * @throws ArithmeticException      If the amount is invalid
	 * @throws IllegalArgumentException If the serial number is invalid
	 */
	public Currency(int amount, String serialNumber) {
		if (!VALID_DENOMINATIONS.contains(amount)) {
			throw new ArithmeticException("Incorrect amount: " + amount);
		}
		if (!isValidSerialNumber(serialNumber)) {
			throw new IllegalArgumentException("Invalid serial number: " + serialNumber);
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
	 * Returns the serial number of the currency.
	 * 
	 * @return The serial number
	 */
	public String getSerial() {
		return serialNumber;
	}

	/**
	 * Returns the denomination (amount) of the currency.
	 * 
	 * @return The denomination
	 */
	public int getDenomination() {
		return amount;
	}

	/**
	 * Override of compareTo for the Comparable interface. Orders Currency objects
	 * by denomination first, then by serial number in ascending order.
	 * 
	 * @param other The other Currency object to compare to
	 * @return A negative, zero, or positive value depending on comparison result
	 */
	@Override
	public int compareTo(Currency other) {
		int denominationComparison = Integer.compare(this.amount, other.amount);
		if (denominationComparison != 0) {
			return denominationComparison;
		}
		return this.serialNumber.compareTo(other.serialNumber); // Secondary comparison by serial number
	}

	/**
	 * Provides a string representation of the Currency object.
	 * 
	 * @return A formatted string
	 */
	@Override
	public String toString() {
		return "$" + amount + ": " + serialNumber;
	}
}
