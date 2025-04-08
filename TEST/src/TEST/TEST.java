package TEST;

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Scanner;
public class TEST {
    /**
     * @author EJ Heinz
     * The main method is the program's starting point and will
     * attempt to find a solution to the router problem.
     */
    /*
     * Did that fix the problem? no [Enter] Reboot the router and try to connect.
     * Did that fix the problem? yes [Enter] Notice that the program ends as soon as
     * a solution is found to the problem. Here is another example of the program’s
     * output:
     * 
     * Reboot the computer and try to connect. Did that fix the problem? no [Enter]
     * Reboot the router and try to connect. Did that fix the problem? no [Enter]
     * Make sure the cables between the router & modem are plugged in firmly. Did
     * that fix the problem? no [Enter] Move the router to a new location. Did that
     * fix the problem? no [Enter] Get a new router.
     */

    public static void main(String[] args) {
        

        JOptionPane.showMessageDialog(null, "Troubleshooting a bad Wi-Fi connection:");

        // JOptionPane
        if (trySolution("Restart your computer. Did this fix the problem? y/n")) return;
        if (trySolution("Reboot your router and try connecting again. Did this fix the problem? y/n")) return;
        if (trySolution("Make sure the cables between the router & modem are plugged in firmly. Did this fix the problem? y/n")) return;
        if (trySolution("Move the router to a new location. Did this fix the problem? y/n")) return;

        JOptionPane.showMessageDialog(null, "Get a new router");
        
        
    }

    private static boolean trySolution(String message) {
        String input = JOptionPane.showInputDialog(message);
        if (input != null && !input.isEmpty()) {
            char letter = input.toLowerCase().charAt(0);

            if (letter == 'y') {
            	JOptionPane.showMessageDialog(null, "Issue Resolved");
                return true;
            } else if (letter == 'n') {
                return false;
            } else {
            	JOptionPane.showMessageDialog(null,"Invalid Character");
            }
        } else {
        	JOptionPane.showMessageDialog(null,"No input provided.");
        }
        return false;
    }{
        System.exit(0);
    }

    
}
