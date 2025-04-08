package internationalCurrency;

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
public class InternationalCurrency extends Currency {

	/**
	 * Constructor for InternationalCurrency
	 * 
	 * @param amount       The dollar amount
	 * @param serialNumber The currency's serial number
	 */
	public InternationalCurrency(int amount, String serialNumber) {
		super(amount, serialNumber);
	}

	/**
	 * Converts the dollar value to Euros.
	 * 
	 * @return The value in Euros
	 */
	public double getEuro() {
		return getAmount() * .95;
	}

	/**
	 * Converts the dollar value to Pounds.
	 * 
	 * @return The value in Pounds
	 */
	public double getPound() {
		return getAmount() * .82;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + String.format("%.2f", getEuro()) + " Euros, "
				+ String.format("%.2f", getPound()) + " Pounds";
	}
}
