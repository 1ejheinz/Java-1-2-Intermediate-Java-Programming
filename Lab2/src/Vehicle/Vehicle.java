package Vehicle;

/**
 * @author Edward Heinz
 *         <p>
 *         Vehicle
 *         <p>
 *         Lab2
 *         <p>
 *         EntryPoint contains the main() method. The second class will be
 *         called “Vehicle”.
 */
public class Vehicle {
	// Variables
	private final String vin;
	private static int _NUMBER_OF_AXLES = 0; // Number of axles
	private int resets;
	private int _numOfAxeles;
	private static final int _AXLE_MINIMUM = 2; // Minimum number
	private static final int _AXLE_MAXIMUM = 4; // Maximum number

	/**
	 * Constructor VIN
	 * 
	 * @param vin
	 */
	public Vehicle(String vin) {
		this.vin = vin;
		this.resets = 0; // Resets to 0
		this.reset(); // Call reset

		// Axles to the minimum
		this._numOfAxeles = _AXLE_MINIMUM;
		Vehicle._NUMBER_OF_AXLES = this._numOfAxeles;
	}

	/**
	 * Reset method
	 */
	private void reset() {
		Vehicle._NUMBER_OF_AXLES = 2; // Reset to 2 axles
		this.resets++;
	}

	/**
	 * Get the number of axles for vehicle
	 * 
	 * @return Number of axles
	 */
	public static int getNumberOfAxles() {
		return Vehicle._NUMBER_OF_AXLES;
	}

	/**
	 * @return VIN
	 */
	public String getVin() {
		return this.vin;
	}

	/**
	 * Reset count
	 */
	public void incrementResets() {
		this.resets++;
	}

	/**
	 * Reset count
	 * 
	 * @return Reset count
	 */
	public int getResets() {
		return this.resets;
	}
}
