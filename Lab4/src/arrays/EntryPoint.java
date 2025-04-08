package arrays;

import java.util.Arrays;

public class EntryPoint {

	public static void main(String[] args) {

		// Define the size
		int size = (int) (Math.random() * 6) + 10; // Random size between 10 and 15
		int[] values = ArrayHelper.createArray(size); // Specified size

		// Display the length
		System.out.println("Array Length: " + values.length);

		// Generated
		System.out.println("Generated Array: " + Arrays.toString(values));

		// ArrayHelper methods
		int minPos = ArrayHelper.minPosition(values);
		System.out.println("Index of the minimum value: " + minPos);
		System.out.println("Minimum value: " + values[minPos]);

		int maxPos = ArrayHelper.maxPosition(values);
		System.out.println("Index of the maximum value: " + maxPos);
		System.out.println("Maximum value: " + values[maxPos]);

		double average = ArrayHelper.arrayAverage(values);
		System.out.println("Average value: " + average);
	}
}
