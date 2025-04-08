package lab13;

/**
 * @author Edward Heinz
 *         <p>
 *         MagicMatrix
 *         <p>
 *         Lab5
 *         <p>
 *         EntryPoint contains the main() method and tests the functionality of the MagicMatrix class by creating and
 *         analyzing various matrices. The second class will be
 *         called “MagicMatrix”.
 */
import java.util.Arrays;

public class MagicMatrix {
	private int[][] matrix;

	// Validates the matrix has valid structure
	public MagicMatrix(int[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			throw new IllegalArgumentException("Matrix must not be null or empty.");
		}
		for (int[] row : matrix) {
			if (row == null || row.length != matrix.length) {
				throw new IllegalArgumentException("Matrix is not square.");
			}
		}
		this.matrix = matrix;
	}

	// Determines if the matrix is semi-magic by row
	public boolean rowWiseMagic() {
		int targetSum = Arrays.stream(matrix[0]).sum(); // Sums
		for (int[] row : matrix) {
			if (Arrays.stream(row).sum() != targetSum) {
				return false;
			}
		}
		return true;
	}

	// Determines if the matrix is semi-magic by column
	public boolean colWiseMagic() {
		// Find the maximum number of columns
		int maxCols = Arrays.stream(matrix).mapToInt(row -> row.length).max().orElse(0);

		// Calculate the sum of the first column
		int[] colSums = new int[maxCols];
		Arrays.fill(colSums, 0);

		// Calculate column sums dynamically
		for (int[] row : matrix) {
			for (int col = 0; col < row.length; col++) {
				colSums[col] += row[col];
			}
		}

		// Check if all column sums are equal
		int targetSum = colSums[0];
		for (int colSum : colSums) {
			if (colSum != targetSum) {
				return false;
			}
		}

		return true;
	}

	// Determines if the matrix is fully magic
	public boolean isMagic() {
		return rowWiseMagic() && colWiseMagic();
	}

	// Override toString() for matrix representation
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int[] row : matrix) {
			sb.append(Arrays.toString(row)).append("\n");
		}
		return sb.toString();
	}
}
