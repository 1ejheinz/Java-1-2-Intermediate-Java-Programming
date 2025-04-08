package Chapter4;
import java.util.Random;
import javax.swing.JOptionPane;

public class Chap4 {
	/**
	 * @author EJ Heinz The main method is the program's starting point and will show a random object, for loop,
	 *         slot machine.
	 */
	
	/*
     * Create a program that simulates a slot machine. When the program runs, it should do the following:
     * 
     * Asks the user to enter the amount of money he or she wants to enter into the slot machine.
     * 
     * Instead of displaying images, the program will randomly select a word from the following list:
     * 
     * Cherries, Oranges, Plums, Bells, Melons, Bars
     * 
     * To select a word, the program can generate a random number in the range of 0 through 5. If the number is 0, the
     * selected word is Cherries; if the number is 1, the selected word is Oranges; and so forth. The program should
     * randomly select a word from this list three times and display all three of the words.
     * 
     * If none of the randomly selected words match, the program will inform the user that he or she has won $0. If two
     * of the words match, the program will inform the user that he or she has won two times the amount entered. If
     * three of the words match, the program will inform the user that he or she has won three times the amount entered.
     * 
     * The program will ask whether the user wants to play again. If so, these steps are repeated. If not, the program
     * displays the total amount of money entered into the slot machine and the total amount won.
     */

    public static void main(String[] args) {
        Random random = new Random();
        String[] words = {"Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"};

        double totalMoneyEntered = 0;
        double totalMoneyWon = 0;
        boolean playAgain = true;

        while (playAgain) {
            String input = JOptionPane.showInputDialog("Enter the amount of money you want to enter into the slot machine:");
            if (input == null || input.isEmpty()) {
                break;
            }
            double moneyEntered = Double.parseDouble(input);

            totalMoneyEntered += moneyEntered;

            // Select 3 random words
            String word1 = words[random.nextInt(6)];
            String word2 = words[random.nextInt(6)];
            String word3 = words[random.nextInt(6)];

            // Display selected words
            JOptionPane.showMessageDialog(null, "The slot machine displays: " + word1 + " ," + word2 + ", " + word3);

            // Calculate winnings
            double winnings = 0;
            if (word1.equals(word2) && word2.equals(word3)) {
                winnings = moneyEntered * 3;
                JOptionPane.showMessageDialog(null, "Congratulations! All three words match. You win $" + winnings);
            } else if (word1.equals(word2) || word2.equals(word3) || word1.equals(word3)) {
                winnings = moneyEntered * 2;
                JOptionPane.showMessageDialog(null, "Congratulations! Two words match. You win $" + winnings);
            } else {
                JOptionPane.showMessageDialog(null, "No matches. You win $0.");
            }

            totalMoneyWon += winnings;

            //play again
            String[] options = {"Yes", "No"};
            int response = JOptionPane.showOptionDialog(null, "Do you want to play again?", "Play Again",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            playAgain = (response == 0);
        }

        // Display amounts
        JOptionPane.showMessageDialog(null, "Total money entered into the slot machine: $" + totalMoneyEntered);
        JOptionPane.showMessageDialog(null, "Total money won: $" + totalMoneyWon);
    }
}
