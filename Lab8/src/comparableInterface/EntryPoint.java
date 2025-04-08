package comparableInterface;

import java.util.Arrays;

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
public class EntryPoint {
	public static void main(String[] args) {
		// Create an array of Currency objects with varying denominations and serial
		// numbers
		Currency[] currencies = { new Currency(10, "A123456789B"), new Currency(5, "B987654321C"),
				new Currency(20, "C543216789D"), new Currency(10, "D456789123A"), new Currency(50, "E789654321B") };

		// Display all items in the array using an enhanced for loop
		System.out.println("Original Array:");
		for (Currency currency : currencies) {
			System.out.println(currency);
		}

		// Sort the array using Arrays.sort()
		Arrays.sort(currencies);

		// Display all items in the sorted array using another enhanced for loop
		System.out.println("\nSorted Array:");
		for (Currency currency : currencies) {
			System.out.println(currency);
		}
	}
}
