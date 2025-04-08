package temperatureCalc;

import java.util.Scanner;

public class TemperatureCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Get user inputs with validation
		double ovenSize = getValidInput(scanner, "Enter the oven size in square feet: ");
		double apartmentSize = getValidInput(scanner, "Enter the apartment size in square feet: ");
		double initialRoomTemp = getValidInput(scanner, "Enter the initial temperature of the room (Fahrenheit): ");
		double targetTemp = getValidInput(scanner, "Enter the target temperature (Fahrenheit): ");
		double ovenTemp = getValidInput(scanner, "Enter the oven operating temperature (Fahrenheit): ");
		double startTime = getValidInput(scanner, "Enter the start time (in hours, 24-hour format): ");
		double endTime = getValidInput(scanner, "Enter the end time (in hours, 24-hour format): ");

		// Calculate time duration
		double duration = calculateDuration(startTime, endTime);

		// Calculate temperature increase due to the oven and furnace
		double ovenTempIncrease = calculateOvenTempIncrease(ovenSize, apartmentSize, ovenTemp, duration);
		double furnaceTempIncrease = calculateFurnaceTempIncrease(initialRoomTemp, targetTemp);

		// Display the results using System.out.println
		double combinedTempIncrease = initialRoomTemp + ovenTempIncrease + furnaceTempIncrease;
		System.out.println("The temperature increase due to the oven is: " + ovenTempIncrease + "°F");
		System.out.println("The temperature increase due to the furnace is: " + furnaceTempIncrease + "°F");
		System.out.println("The combined temperature increase in the apartment is: " + combinedTempIncrease + "°F");
		System.out.println("Time duration for the calculations: " + duration + " hours");
	}

	// Method to get valid input from the user
	private static double getValidInput(Scanner scanner, String prompt) {
		double input = 0.0;
		boolean valid = false;
		while (!valid) {
			System.out.print(prompt);
			if (scanner.hasNextDouble()) {
				input = scanner.nextDouble();
				valid = true;
			} else {
				System.out.println("Invalid input. Please enter a numeric value.");
				scanner.next(); // Clear the invalid input
			}
		}
		return input;
	}

	// Method to calculate the temperature increase due to the oven
	private static double calculateOvenTempIncrease(double ovenSize, double apartmentSize, double ovenTemp,
			double duration) {
		double ovenHeatingEfficiency = 0.3; // Updated assumed efficiency for the oven heating
		double tempIncrease = (ovenHeatingEfficiency * ovenSize * ovenTemp * duration) / apartmentSize;
		return tempIncrease;
	}

	// Method to calculate the temperature increase due to the furnace
	private static double calculateFurnaceTempIncrease(double initialTemp, double targetTemp) {
		return targetTemp - initialTemp;
	}

	// Method to calculate time duration
	private static double calculateDuration(double startTime, double endTime) {
		if (endTime >= startTime) {
			return endTime - startTime;
		} else {
			return (24 - startTime) + endTime; // Handle cases where the end time is past midnight
		}
	}
}
