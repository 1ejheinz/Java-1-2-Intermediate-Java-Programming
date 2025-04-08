package EJHeinzChapter3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EJHeinzChapter3 {
	// TODO Auto-generated method stub
		/**
		 * @author EJ Heinz The main method is the program's starting point and will
		 *         attempt to find a solution to the router problem. The JOptionPane method is commented out. 
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
			// TODO Auto-generated method stub

			Scanner input = new Scanner(System.in);

			System.out.println("Troubleshooting a bad Wi-Fi connection:");

			// Reboot cpu
			System.out.println("Reboot your computer and try connecting again.");
			System.out.println("Did that fix the problem? (y/n)");
			String letter = input.nextLine().toLowerCase();
			if (letter.equals("y")) {
				System.out.println("Issue resolved!");
				return;
			} else if (letter.equals("n")) {
				// Reboot router
				System.out.println("Reboot your router and try connecting again.");
				System.out.println("Did that fix the problem? (y/n)");
				letter = input.nextLine().toLowerCase();
				if (letter.equals("y")) {
					System.out.println("Issue resolved!");
					return;
				} else if (letter.equals("n")) {
					// Check device connection
					System.out.println("Make sure the cables between the router & modem are plugged in firmly.");
					System.out.println("Did that fix the problem? (y/n)");
					letter = input.nextLine().toLowerCase();
					if (letter.equals("y")) {
						System.out.println("Issue resolved!");
						return;
					} else if (letter.equals("n")) {
						// Router location
						System.out.println("Move the router to a new location.");
						System.out.println("Did that fix the problem? (y/n)");
						letter = input.nextLine().toLowerCase();
						if (letter.equals("y")) {
							System.out.println("Issue resolved!");
							return;
						} else if (letter.equals("n")) {
							// New router
							System.out.println("Get a new router.");
						} else {
							System.out.println("Invalid Character");
						}
					} else {
						System.out.println("Invalid Character");
					}
				} else {
					System.out.println("Invalid Character");
				}
			} else {
				System.out.println("Invalid Character");
			}

			input.close();
		}

	}
/*public static void main(String[] args) {
    

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


}*/