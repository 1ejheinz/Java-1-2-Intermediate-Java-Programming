package coinTossSimulator;

import java.util.Random;

/*Write a class named Coin. The Coin class should have the following field: A String named sideUp. 
 * The sideUp field will hold either “heads” or “tails” indicating the side of the coin that is facing up. 
 * The Coin class should have the following methods: A no-arg constructor that randomly determines the side of the coin that is 
 * facing up (“heads” or “tails”) and initializes the sideUp field accordingly. A void method named toss that simulates the 
 * tossing of the coin. When the toss method is called, it randomly determines the side of the coin that is facing up 
 * (“heads” or “tails”) and sets the sideUp field accordingly. A method named getSideUp that returns the value of the sideUp field.
 *  Write a program that demonstrates the Coin class. The program should create an instance of the class and display the side that
 * is initially facing up. Then, use a loop to toss the coin 20 times. Each time the coin is tossed, display the side that is
 * facing up. The program should keep count of the number of times heads is facing up and the number of times tails is facing up,
 * and display those values after the loop finishes. 
 *   
 *   Part II Write a program that demonstrates the Coin class. 
 *   The program should create an instance of the class and display the side that is initially facing up. 
 *   Then, use a loop to toss the coin 20 times. Each time the coin is tossed, display the side that is facing up. 
 *   The program should keep count of the number of times heads is facing up and the number of times tails is facing up, 
 *   and display those values after the loop finishes. */

public class Coin {
    // Facing up
    private String sideUp;

    // No-arg constructor that initializes the sideUp field randomly
    public Coin() {
        toss(); 
    }

    // Simulate 
    public void toss() {
        Random random = new Random();

        // Determine
        if (random.nextBoolean()) {
            sideUp = "heads";
        } else {
            sideUp = "tails";
        }
    }

    // Return 
    public String getSideUp() {
        return sideUp;
    }

    // Test
    public static void main(String[] args) {
        Coin coin = new Coin(); 

        // Facing up?
        System.out.println("Initial side facing up: " + coin.getSideUp());

        int headsCount = 0;
        int tailsCount = 0;

        // Toss 20 times  
        for (int i = 0; i < 20; i++) {
            coin.toss();
            System.out.println("Toss " + (i + 1) + ": " + coin.getSideUp());
            if (coin.getSideUp().equals("heads")) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }

        // Count 
        System.out.println("Heads count: " + headsCount);
        System.out.println("Tails count: " + tailsCount);
    }
}
