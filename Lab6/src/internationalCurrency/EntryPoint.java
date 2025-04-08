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
 *         <p>
 *         International Currency
 *         <p>
 *         Lab6 
 *         <p>
 *         EntryPoint contains the main() method. The second class will be
 *         called “Currency” and the Third will be "InternationalCurency" that uses inheritance and protected. 
 */
import java.util.ArrayList;
import java.util.List;

public class EntryPoint {

	public static void main(String[] args) {
		// Create a list of InternationalCurrency objects
		List<InternationalCurrency> currencyList = new ArrayList<>();
		currencyList.add(new InternationalCurrency(1, "ML16003186G"));
		currencyList.add(new InternationalCurrency(5, "DA12345432C"));
		currencyList.add(new InternationalCurrency(10, "GX54321987A"));
		currencyList.add(new InternationalCurrency(20, "HY82746534G"));
		currencyList.add(new InternationalCurrency(50, "XA96735390F"));

		// Enhanced for-loop to display each object's values
		for (InternationalCurrency currency : currencyList) {
			System.out.println(currency);
		}
	}

}
