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
public class EntryPoint {
	public static void main(String[] args) {
		// Create object with a VIN
		Vehicle myVehicle = new Vehicle("1F4FP25B2WR806790");

		// Display the Vehicle VIN/number of axles
		System.out.println("VIN: " + myVehicle.getVin());
		System.out.println("Axles: " + Vehicle.getNumberOfAxles());

		// Reset count with display
		myVehicle.incrementResets();
		System.out.println("Reset count: " + myVehicle.getResets());
	}
}
