package Tempature;

/**
 * @author Edward Heinz
 *         <p>
 *         Conversions
 *         <p>
 *         Lab1
 *         <p>
 *         Conversion class contains static methods to convert temp values.
 */
public class TempConversion {

	/**
	 * Converts Celsius to Fahrenheit.
	 *
	 * @param celsius
	 * @return fahrenheit
	 */
	public static double celsiusToFahrenheit(double celsius) {
		return Math.round((celsius * 9 / 5 + 32) * 100.0) / 100.0;
	}

	/**
	 * Converts Fahrenheit to Celsius.
	 *
	 * @param fahrenheit
	 * @return celsius
	 */
	public static double fahrenheitToCelsius(double fahrenheit) {
		return Math.round(((fahrenheit - 32) * 5 / 9) * 100.0) / 100.0;
	}
}
