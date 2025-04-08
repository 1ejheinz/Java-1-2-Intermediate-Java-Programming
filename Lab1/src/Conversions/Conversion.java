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
 */
public class Conversion {

	/**
	 * Converts miles to kilometers.
	 * 
	 * @param miles
	 * @return kilometers
	 */
	public static double milesToKm(double miles) {
		return Math.round((miles / 0.62) * 100.0) / 100.0;
	}

	/**
	 * Converts kilometers to miles, rounded
	 * 
	 * @param kilometers
	 * @return miles
	 */
	public static double kmToMiles(double kilometers) {
		return Math.round((kilometers * 0.62) * 100.0) / 100.0;
	}

	/**
	 * Calculates run rate in minutes per mile.
	 * 
	 * @param miles   - distance in miles
	 * @param minutes - time in minutes
	 * @return minutes per mile; 0 is invalid
	 */
	public static double runRate(int miles, double minutes) {
		// Check for invalid
		if (miles <= 0 || minutes <= 0) {
			return 0;
		}
		// Calculate and return the run rate in minutes per mile, rounded
		double rate = minutes / miles;
		return Math.round(rate * 100.0) / 100.0;
	}

	/**
	 * Returns the name of the day via input number.
	 * 
	 * @param dayNumber - number representing the day of the week (1=”Sunday”, …,
	 *                  7=”Saturday”)
	 * @return name of the day or empty string
	 */
	/*
	 * public static String weekDay(int dayNumber) { // switch statement switch
	 * (dayNumber) { case 1: return "Sunday"; case 2: return "Monday"; case 3:
	 * return "Tuesday"; case 4: return "Wednesday"; case 5: return "Thursday"; case
	 * 6: return "Friday"; case 7: return "Saturday"; default: // invalid input
	 * return ""; } }
	 */

	public static String weekDay(int dayNumber) {
		// Array holding the names of the days of the week
		String[] days = { "", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		// Check if the dayNumber is valid
		if (dayNumber >= 1 && dayNumber <= 7) {
			return days[dayNumber];
		} else {
			// Return an empty string for invalid input
			return "";
		}

	}
}
