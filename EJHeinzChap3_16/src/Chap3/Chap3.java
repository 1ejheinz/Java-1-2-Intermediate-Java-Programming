package Chap3;

/**
 * @author EJ Heinz The main method is the program's starting point and will
 *         return the number of points earned based on the number of books
 *         purchased.
 */
import java.util.Scanner;

public class Chap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarations
		int numberOfBooksPurchased;
		int pointsAwarded;

		//Scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);

		// Pull the number of books purchased
		System.out.print("How many books have you purchased? ");
		numberOfBooksPurchased = keyboard.nextInt();

		keyboard.close();

		//points awarded
		pointsAwarded = getPointsEarned(numberOfBooksPurchased);

		// Display the points earned.
		System.out.println("You've earned " + pointsAwarded + " points.");
	}

	public static int getPointsEarned(int numberOfBooksPurchased) {

		if (numberOfBooksPurchased == 0) {
			return 0;
		} else if (numberOfBooksPurchased == 1) {
			return 5;
		} else if (numberOfBooksPurchased == 2) {
			return 15;
		} else if (numberOfBooksPurchased == 3) {
			return 30;
		} else if (numberOfBooksPurchased == 4) {
			return 60;
		} else if (numberOfBooksPurchased > 4) {
			return 60;
		}
		System.exit(0);
		return getPointsEarned(0);
	}
}