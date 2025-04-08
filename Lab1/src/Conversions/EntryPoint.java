package Conversions;

/**
 * @author Edward Heinz
 *         <p>
 *         Conversions
 *         <p>
 *         Lab1
 *         <p>
 *         Conversion class contains static methods to convert values and
 *         calculate run rates and add day.
 *     
 *         @param miles
 *         @return kilometers
 */
import javax.swing.JOptionPane;

public class EntryPoint {
	public static void main(String[] args) {
		// User input for milesToKm
		String milesStr = JOptionPane.showInputDialog("Enter miles to convert to kilometers:");
		double miles = Double.parseDouble(milesStr);
		JOptionPane.showMessageDialog(null, miles + " miles is " + Conversion.milesToKm(miles) + " kilometers");

		// User input for kmToMiles
		String kilometersStr = JOptionPane.showInputDialog("Enter kilometers to convert to miles:");
		double kilometers = Double.parseDouble(kilometersStr);
		JOptionPane.showMessageDialog(null,
				kilometers + " kilometers is " + Conversion.kmToMiles(kilometers) + " miles");

		// Test runRate method with multiple calls, rounded
		double runRate1 = Conversion.runRate(5, 50.0);
		JOptionPane.showMessageDialog(null, "Run rate (5 miles, 50 minutes): " + runRate1 + " minutes per mile");

		double runRate2 = Conversion.runRate(3, 20.0);
		JOptionPane.showMessageDialog(null, "Run rate (3 miles, 20 minutes): " + runRate2 + " minutes per mile");

		double runRate3 = Conversion.runRate(0, 20.0); // Invalid
		JOptionPane.showMessageDialog(null,
				"Run rate (0 miles, 20 minutes): " + runRate3 + " minutes per mile (Invalid input)");

		double runRate4 = Conversion.runRate(-5, 50.0); // Invalid
		JOptionPane.showMessageDialog(null,
				"Run rate (-5 miles, 50 minutes): " + runRate4 + " minutes per mile (Invalid input)");

		double runRate5 = Conversion.runRate(5, -50.0); // Invalid
		JOptionPane.showMessageDialog(null,
				"Run rate (5 miles, -50 minutes): " + runRate5 + " minutes per mile (Invalid input)");

		// Test weekDay with multiple calls
		JOptionPane.showMessageDialog(null, "Day for 1: " + Conversion.weekDay(1));
		JOptionPane.showMessageDialog(null, "Day for 2: " + Conversion.weekDay(2));
		JOptionPane.showMessageDialog(null, "Day for 3: " + Conversion.weekDay(3));
		JOptionPane.showMessageDialog(null, "Day for 4: " + Conversion.weekDay(4));
		JOptionPane.showMessageDialog(null, "Day for 5: " + Conversion.weekDay(5));
		JOptionPane.showMessageDialog(null, "Day for 6: " + Conversion.weekDay(6));
		JOptionPane.showMessageDialog(null, "Day for 7: " + Conversion.weekDay(7));
		JOptionPane.showMessageDialog(null, "Day for 8: " + Conversion.weekDay(8));
	}
}
