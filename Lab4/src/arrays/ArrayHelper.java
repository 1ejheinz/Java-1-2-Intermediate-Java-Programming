package arrays;

/**
 * @author Edward Heinz
 *         <p>
 *         ArrayHelper
 *         <p>
 *         Lab4
 *         <p>
 *         EntryPoint contains the main() method. The second class will be
 *         called “ArrayHelper”.
 */
import java.util.Random;

public class ArrayHelper {

	// Method to find the index of the smallest value
	public static int minPosition(int[] values) {
		if (values == null || values.length == 0) {
			throw new IllegalArgumentException("Array must not be null or empty.");
		}
		int minPos = 0;
		for (int i = 1; i < values.length; i++) {
			if (values[i] < values[minPos]) {
				minPos = i;
			}
		}
		return minPos;
	}

	// Method to find the index of the largest value
	public static int maxPosition(int[] values) {
		if (values == null || values.length == 0) {
			throw new IllegalArgumentException("Array must not be null or empty.");
		}
		int maxPos = 0;
		for (int i = 1; i < values.length; i++) {
			if (values[i] > values[maxPos]) {
				maxPos = i;
			}
		}
		return maxPos;
	}

	// Method to calculate the average of the array
	public static double arrayAverage(int[] values) {
		if (values == null || values.length == 0) {
			throw new IllegalArgumentException("Array must not be null or empty.");
		}
		int sum = 0;
		for (int value : values) {
			sum += value;
		}
		return (double) sum / values.length;
	}

	// Method to populate an array with random values from 1 to 100
	public static void fillArray(int[] values) {
		if (values == null || values.length == 0) {
			throw new IllegalArgumentException("Array must not be null or empty.");
		}
		Random rand = new Random();
		for (int i = 0; i < values.length; i++) {
			values[i] = rand.nextInt(100) + 1;
		}
	}

	// Method to create an array with a specified size
	public static int[] createArray(int size) {
		if (size < 1 || size > 20) { // Size limits
			throw new IllegalArgumentException("Array size must be between 1 and 20.");
		}
		int[] values = new int[size];
		fillArray(values);
		return values;
	}
}
