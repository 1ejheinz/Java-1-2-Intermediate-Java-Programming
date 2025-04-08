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
import java.util.Random;

public class EntryPoint {

	public static void main(String[] args) {
		// Test cases
		int[][] magicMatrix = { { 1, 5, 9 }, { 8, 3, 4 }, { 6, 7, 2 } };

		int[][] rowSemiMagicMatrix = { { 3, 3, 3 }, { 4, 4, 4 }, { 5, 5, 5 } };

		int[][] colSemiMagicMatrix = { { 2, 4, 6 }, { 2, 4, 6 }, { 2, 4, 6 } };

		int[][] randomMatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// Illegal test cases
		int[][] raggedArray = { { 1, 2, 3 }, { 4, 5 }, { 6 } }; // Ragged

		int[][] rectangleMatrix = { { 1, 2, 3 }, { 4, 5, 6 } }; // Rectangular

		int[][] singleRow = { { 1, 2, 3 } }; // Single row

		int[][] singleColumn = { { 1 }, { 2 }, { 3 } }; // Single column

		int[][] emptyMatrix = {}; // Empty

		// Extra
		int[][] extraMatrix = { { 7, 6, 7, 4 }, { 4, 7, 6, 7 }, { 7, 6, 4, 7 }, { 5, 5, 7, 7 } };

		// Test matrices
		testMatrix(magicMatrix, "Magic Matrix");
		testMatrix(rowSemiMagicMatrix, "Row Semi-Magic Matrix");
		testMatrix(colSemiMagicMatrix, "Column Semi-Magic Matrix");
		testMatrix(randomMatrix, "Random Matrix");

		// Test illegal matrices
		testMatrix(raggedArray, "Ragged Array");
		testMatrix(rectangleMatrix, "Rectangle Matrix");
		testMatrix(singleRow, "Single Row");
		testMatrix(singleColumn, "Single Column");
		testMatrix(emptyMatrix, "Empty Matrix");

		// Test predefined
		testMatrix(extraMatrix, "Extra Matrix");

		// Dynamic matrix generation and testing
		findSemiMagicMatrix(4, 800);
	}

	// Test matrices
	private static void testMatrix(int[][] matrix, String testName) {
		try {
			MagicMatrix magicMatrix = new MagicMatrix(matrix);
			System.out.printf("Testing: %s\n", testName);
			System.out.println(magicMatrix);
			System.out.printf("Row wise magic: %b\n", magicMatrix.rowWiseMagic());
			System.out.printf("Column wise magic: %b\n", magicMatrix.colWiseMagic());
			System.out.printf("Fully magic: %b\n", magicMatrix.isMagic());
		} catch (IllegalArgumentException e) {
			System.out.printf("Exception: %s\n", e.getMessage());
		}
		System.out.println("--------------------------");
	}

	// Generates random matrices and searches for semi-magic properties
	private static void findSemiMagicMatrix(int size, int maxTries) {
		Random random = new Random();
		int attempts = 0;

		while (attempts < maxTries) {
			int[][] randomMatrix = generateRandomMatrix(size);

			try {
				MagicMatrix magicMatrix = new MagicMatrix(randomMatrix);
				boolean isRowWiseMagic = magicMatrix.rowWiseMagic();
				boolean isColWiseMagic = magicMatrix.colWiseMagic();

				if (isRowWiseMagic && !isColWiseMagic) {
					System.out.println("Found after " + attempts + " tries:");
					System.out.println(magicMatrix);
					System.out.printf("Row wise magic: %b\n", isRowWiseMagic);
					System.out.printf("Col wise magic: %b\n", isColWiseMagic);
					System.out.printf("Magic: %b\n", magicMatrix.isMagic());
					return; // Exit after finding the first matching matrix
				}
			} catch (IllegalArgumentException e) {
				// Skip invalids
			}

			attempts++;
		}

		System.out.println("No semi-magic matrix found after " + maxTries + " tries.");
	}

	private static int[][] generateRandomMatrix(int size) {
		Random random = new Random();
		int[][] matrix = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrix[i][j] = random.nextInt(10); // Random values between 0 and 9
			}
		}
		return matrix;
	}
}