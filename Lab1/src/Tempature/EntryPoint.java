package Tempature;

import javax.swing.JOptionPane;

public class EntryPoint {

	public static void main(String[] args) {
		// User to enter a temperature in Celsius
		String input = JOptionPane.showInputDialog(null, "Enter temperature in Celsius:");

		// Convert to a double
		double celsius = Double.parseDouble(input);

		// Use the TempConversion class to convert Celsius to Fahrenheit
		double fahrenheit = TempConversion.celsiusToFahrenheit(celsius);

		// Display the result.
		JOptionPane.showMessageDialog(null, "Temperature in Fahrenheit: " + fahrenheit);
	}
}
