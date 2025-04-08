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

public class WeightedDie extends Die {
	private double[] _cumulativeProbabilities;

	// Default constructor
	public WeightedDie() {
		super();
	}

	// Constructor with weights
	public WeightedDie(double[] weights) {
		super(); // Call parent constructor
		validateWeights(weights);
		computeCumulativeProbabilities(weights);
	}

	// Validate weights for correctness
	private void validateWeights(double[] weights) {
		if (weights.length != 6) { // 6 sides of the die
			throw new IllegalArgumentException("The number of weights must be 6 (for a 6-sided die).");
		}

		double sum = 0.0;
		for (double weight : weights) {
			if (weight < 0 || weight > 1) {
				throw new IllegalArgumentException("Weights must be between 0 and 1.");
			}
			sum += weight;
		}

		if (Math.abs(sum - 1.0) > 0.0001) {
			throw new IllegalArgumentException("The cumulative weights must add up to 1.");
		}
	}

	// Compute cumulative probabilities
	private void computeCumulativeProbabilities(double[] weights) {
		_cumulativeProbabilities = new double[weights.length];
		double cumulative = 0.0;

		for (int i = 0; i < weights.length; i++) {
			cumulative += weights[i];
			_cumulativeProbabilities[i] = cumulative;
		}
	}

	// Override roll() to support weighted rolling
	@Override
	public int roll() {
		if (_cumulativeProbabilities == null) {
			return super.roll(); // Fall back to normal rolling
		}

		double randomValue = new Random().nextDouble();
		for (int i = 0; i < _cumulativeProbabilities.length; i++) {
			if (randomValue <= _cumulativeProbabilities[i]) {
				_pips = i + 1; // Use protected _pips directly
				return _pips;
			}
		}

		_pips = 6; // Fallback, should not occur
		return _pips;
	}

	// Updated equals() method using instanceof
	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj)) {
			return false; // Use Die's equals for basic comparison
		}
		if (!(obj instanceof WeightedDie)) {
			return false; // Ensure obj is WeightedDie or subclass
		}
		WeightedDie other = (WeightedDie) obj; // Safe cast
		if (_cumulativeProbabilities == null && other._cumulativeProbabilities == null) {
			return true; // Both unweighted
		}
		if (_cumulativeProbabilities == null || other._cumulativeProbabilities == null) {
			return false; // One unweighted, one weighted
		}
		if (_cumulativeProbabilities.length != other._cumulativeProbabilities.length) {
			return false; // Mismatched array sizes
		}
		for (int i = 0; i < _cumulativeProbabilities.length; i++) {
			if (Double.compare(_cumulativeProbabilities[i], other._cumulativeProbabilities[i]) != 0) {
				return false; // Probabilities mismatch
			}
		}
		return true; // All probabilities match
	}

	@Override
	public String toString() {
		if (_cumulativeProbabilities == null) {
			return "WeightedDie (Unweighted): Current Face Value = " + _pips;
		}
		StringBuilder sb = new StringBuilder("WeightedDie (Weighted):\n");
		for (int i = 0; i < _cumulativeProbabilities.length; i++) {
			sb.append("Face ").append(i + 1).append(": Cumulative Probability = ").append(_cumulativeProbabilities[i])
					.append("\n");
		}
		sb.append("Current Face Value = ").append(_pips);
		return sb.toString();
	}
}
