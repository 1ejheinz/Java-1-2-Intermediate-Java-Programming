package coinTossSimulator;

import javax.swing.JOptionPane;

public class CoinTest {
    public static void main(String[] args) {
        String gameExplanation = "Coin Toss Game!\n\n" +
                "Balance is $0. During each toss, three coins will be tossed:\n" +
                "- A quarter = $0.25\n" +
                "- A dime = $0.10\n" +
                "- A nickel = $0.05\n\n" +
                "If a coin lands heads-up, the value will be added to the balance. Game ends when your balance reaches $1.00 or above.\n" +
                "If balance is $1.00, its a win! If it exceeds $1.00, you lose.\n\n";
                
        JOptionPane.showMessageDialog(null, gameExplanation);

        // Create coin classes
        Coin quarter = new Coin();
        Coin dime = new Coin();
        Coin nickel = new Coin();

        // Initialize to 0
        double balance = 0.0;

        //Values
        double quarterValue = 0.25;
        double dimeValue = 0.10;
        double nickelValue = 0.05;

        // Play 
        while (balance < 1.0) {
            quarter.toss();
            dime.toss();
            nickel.toss();

            // Check quarter
            if (quarter.getSideUp().equals("heads")) {
                balance += quarterValue;
                JOptionPane.showMessageDialog(null, "Quarter: heads");
            } else {
                JOptionPane.showMessageDialog(null, "Quarter: tails");
            }

            // Check dime
            if (dime.getSideUp().equals("heads")) {
                balance += dimeValue;
                JOptionPane.showMessageDialog(null, "Dime: heads");
            } else {
                JOptionPane.showMessageDialog(null, "Dime: tails");
            }

            // Check nickel
            if (nickel.getSideUp().equals("heads")) {
                balance += nickelValue;
                JOptionPane.showMessageDialog(null, "Nickel: heads");
            } else {
                JOptionPane.showMessageDialog(null, "Nickel: tails");
            }

            // Display current
            JOptionPane.showMessageDialog(null, String.format("Balance: $%.2f", balance));

            // Check balance
            if (balance == 1.0) {
                JOptionPane.showMessageDialog(null, "$1.00. You win.");
                break;
            } else if (balance > 1.0) {
                JOptionPane.showMessageDialog(null, "Exceeds $1.00. You lose!");
                break;
            }
        }
    }
}
