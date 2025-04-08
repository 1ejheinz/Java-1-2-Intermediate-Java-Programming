package WeightedDie;

/**
 * @author Edward Heinz
 *         <p>
 *         WeightedDie
 *         <p>
 *         Lab7
 *         <p>
 *         WeightedDieTester contains the main() method. The second class will
 *         be called “Die” and the Third will be "WeightedDie" that uses
 *         inheritance and extends "Die".
 */
public class WeightedDieTester {
	public static void main(String[] args) {
		// Define weights for the die
		double[] weights = { 0.1, 0.1, 0.1, 0.5, 0.1, 0.1 };

		try {
			// Instantiate WeightedDie
			Die weightedDie = new WeightedDie(weights); // Using polymorphism

			// Dynamic type check with instanceof
			if (weightedDie instanceof WeightedDie) {
				System.out.println("This is an instance of WeightedDie.");
			} else if (weightedDie instanceof Die) {
				System.out.println("This is an instance of Die.");
			}

			// Roll the die 10,000 times
			int[] outcomes = new int[6]; // Array to accumulate outcomes

			int rolls = 10000;
			for (int i = 0; i < rolls; i++) {
				int rollValue = weightedDie.roll();
				outcomes[rollValue - 1]++; // Increment count for the rolled face value
			}

			// Print the results
			System.out.println("Value\tRolled\tPercent");
			for (int i = 0; i < outcomes.length; i++) {
				double percent = (outcomes[i] / (double) rolls) * 100;
				System.out.printf("%d\t%d\t%.2f%%\n", i + 1, outcomes[i], percent);
			}
		} catch (IllegalArgumentException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}
