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
/*Add a single class called
“EntryPoint” that contains the main() method.
You must create a class called Currency that accepts an integer parameter and a
String parameter on its constructor representing the dollar value and the serial
number respectively. The constructor must detect an invalid dollar amount and
throw an ArithmeticException with the message “incorrect amount: x”
where x is the amount received on the first parameter. Valid amounts will range
from 1 to 100 in the current valid denominations of US currency. The second
constructor parameter is for a serial number. A valid serial number (for the
purposes of this exercise) must be either 10 or 11 characters in length and both
begin and end with an alphabetic character. If the serial number does not pass
validation then an IllegalArgumentException will be thrown with the
message “invalid serial number: x” A toString() override method must be
implemented to display the value of the currency returning both the bill value and
its serial number.
Write a Java program that repeatedly accepts an integer and a String from the
keyboard, creates a new Currency object and prints the value of the object to the
console. Your code must adhere to the follow specifications:
 The user must enter 0 for the bill amount to exit the program.
 You must read 2 user input values using the Scanner’s next() method and
then convert the first to an integer using Integer.parseInt(). In case
of an exception (when converting the string to an integer), the program must
(1) Catch the NumberFormatException (2) print the corresponding
stack trace (printStackTrace()) and (3) reset the Scanner object.
 If there was no exception on input, the program will then create a new
Currency object with the user input and catch either the
ArithmeticException or the IllegalArgumentException
exception and print the exception message in case one occurs. No error will
be printed if the user intends to exit by entering zero for the bill amount.
 When there is no exception on construction, the Currency object will be
displayed with a System.out.println().
Example session 1:
Please enter a bill amount and serial number: 5 ML16003186G
$5: ML16003186G
Please enter a bill amount and serial number: 6 ML16003186G
incorrect amount: 6
Please enter a bill amount and serial number: 5 ML1600318
invalid serial number: ML1600318
Please enter a bill amount and serial number: 0
Done.
Example session 2:
Please enter a bill amount and serial number: five 1234567890
java.lang.NumberFormatException: For input string: "five"
at
java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
at java.base/java.lang.Integer.parseInt(Integer.java:660)
at java.base/java.lang.Integer.parseInt(Integer.java:778)
at EntryPoint.main(EntryPoint.java:27)
Please enter a bill amount and serial number: 5 ML16003186G
$5: ML16003186G
Please enter a bill amount and serial number: 0
Done.
All variables must follow expected naming conventions. Your code will have
appropriate comments describing the action of the code and/or the purpose behind
any special variables. The standard multi-line comment section including your
name must be present at the top of the code*/

import java.util.Arrays;
import java.util.List;

public class Currency {
	private int amount;
	private String serialNumber;
	private static final List<Integer> VALID_DENOMINATIONS = Arrays.asList(1, 2, 5, 10, 20, 50, 100);

	/**
	 * 
	 * @param dollar
	 * @param serialNumber
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
	 * Validate
	 * 
	 * @param serialNumber
	 * @return true if the serial number is valid
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

	@Override
	public String toString() {
		return "$" + amount + ": " + serialNumber;
	}
}
