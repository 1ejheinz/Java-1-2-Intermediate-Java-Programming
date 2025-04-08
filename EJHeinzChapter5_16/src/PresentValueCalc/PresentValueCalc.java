package PresentValueCalc;

import javax.swing.JOptionPane;

public class PresentValueCalc {
    /**
     * Suppose you want to deposit a certain amount of money into a savings account, 
     * and then leave it alone to draw interest for the next 10 years. At the end of 10 years,
     * you would like to have $10,000 in the account. How much do you need to deposit today to make that happen?
     * You can use the following formula, which is known as the present value formula.
     *
     * The terms in the formula are as follows:
     *
     * P is the present value, or the amount that you need to deposit today.
     *
     * F is the future value that you want in the account. (In this case, F is $10,000.)
     *
     * r is the annual interest rate.
     *
     * n is the number of years that you plan to let the money sit in the account.
     *
     * Write a method named presentValue that performs this calculation. 
     * The method should accept the future value, annual interest rate, and number of years as arguments. 
     * It should return the present value, which is the amount that you need to deposit today. 
     * Demonstrate the method in a program that lets the user experiment with different values for the formula’s terms.
     *
     * @param futureValue The future value desired in the account
     * @param annualInterestRate The annual interest rate
     * @param years The number of years the money will sit in the account
     * @return The present value, or the amount to deposit today
     */
    public static double presentValue(double futureValue, double annualInterestRate, int years) {
        // Calculate the present value
        double presentValue = futureValue / Math.pow(1 + annualInterestRate, years);
        // Round the result to two decimal places
        return Math.round(presentValue * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        // User input for future value, interest rate, and number of years
        String futureValueStr = JOptionPane.showInputDialog("Enter the desired future value: $");
        double futureValue = Double.parseDouble(futureValueStr);

        String annualInterestRateStr = JOptionPane.showInputDialog("Enter the annual interest rate (as a decimal, e.g., 0.05 for 5%): ");
        double annualInterestRate = Double.parseDouble(annualInterestRateStr);

        String yearsStr = JOptionPane.showInputDialog("Enter the number of years: ");
        int years = Integer.parseInt(yearsStr);

        // Present value
        double presentValue = presentValue(futureValue, annualInterestRate, years);

        // Display the result
        JOptionPane.showMessageDialog(null, String.format(
                "You need to deposit $%.2f today to have $%.2f in %d years at an annual interest rate of %.2f%%.",
                presentValue, futureValue, years, annualInterestRate * 100));
    }
}
