package WeightedDie;

/**
 * @author Edward Heinz
 *         <p>
 *         WeightedDie
 *         <p>
 *         Lab7
 *         <p>
 *         WeightedDieTester contains the main() method. The second class will be
 *         called “Die” and the Third will be "WeightedDie" that
 *         uses inheritance and extends "Die".
 */
import java.util.Random;

public class Die {
	protected int _pips = 1; // Protected to allow subclass access
	private final int _MAX_PIPS = 6;
	private Random _randNum;

	// Constructor to initialize Random class and roll
	public Die() {
		_randNum = new Random();
		this.roll();
	}

	public Die(int seed) {
		_randNum = new Random(seed);
		this.roll();
	}

	// Accessor to return the current face value of the die
	public int sideValue() {
		return _pips;
	}

	// Mutator to randomly change the face value
	public int roll() {
		_pips = _randNum.nextInt(_MAX_PIPS) + 1;
		return _pips;
	}

	// Override toString() for string representation
	@Override
	public String toString() {
		return "Die: Current Face Value = " + _pips;
	}

	// Updated equals() method using instanceof
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true; // Reference equality
		}
		if (!(obj instanceof Die)) {
			return false; // Ensure obj is a Die or subclass
		}
		Die other = (Die) obj; // Safe cast
		return this.sideValue() == other.sideValue(); // Compare face values
	}
}
