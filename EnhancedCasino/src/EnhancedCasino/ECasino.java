package EnhancedCasino;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class ECasino extends JFrame implements ActionListener {

    private JLabel[] slotLabels = new JLabel[3];
    private JButton playButton;
    private JLabel resultLabel;
    private JLabel totalEnteredLabel;
    private JLabel totalWonLabel;

    private String[] words = {"Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"};
    private String[] imagePaths = {
            "C:\\Users\\ejhei\\Desktop\\Java 1\\Homework\\EJHeinzEnhancedCasino\\Images\\cherries.jpg", 
            "C:\\Users\\ejhei\\Desktop\\Java 1\\Homework\\EJHeinzEnhancedCasino\\Images\\oranges.jpg", 
            "C:\\Users\\ejhei\\Desktop\\Java 1\\Homework\\EJHeinzEnhancedCasino\\Images\\plums.jpg", 
            "C:\\Users\\ejhei\\Desktop\\Java 1\\Homework\\EJHeinzEnhancedCasino\\Images\\bells.jpg", 
            "C:\\Users\\ejhei\\Desktop\\Java 1\\Homework\\EJHeinzEnhancedCasino\\Images\\melons.jpg", 
            "C:\\Users\\ejhei\\Desktop\\Java 1\\Homework\\EJHeinzEnhancedCasino\\Images\\bars.jpg"
    };

    private double totalMoneyEntered = 0;
    private double totalMoneyWon = 0;

    public ECasino() {
        setTitle("Slot Machine");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel slotsPanel = new JPanel();
        slotsPanel.setLayout(new GridLayout(1, 3));
        for (int i = 0; i < 3; i++) {
            slotLabels[i] = new JLabel();
            slotLabels[i].setHorizontalAlignment(JLabel.CENTER);
            slotsPanel.add(slotLabels[i]);
        }

        playButton = new JButton("Play");
        playButton.addActionListener(this);
        resultLabel = new JLabel("Welcome to the Slot Machine!", JLabel.CENTER);
        totalEnteredLabel = new JLabel("Total Money Entered: $0", JLabel.CENTER);
        totalWonLabel = new JLabel("Total Money Won: $0", JLabel.CENTER);

        add(slotsPanel, BorderLayout.CENTER);
        add(playButton, BorderLayout.SOUTH);
        add(resultLabel, BorderLayout.NORTH);
        add(totalEnteredLabel, BorderLayout.WEST);
        add(totalWonLabel, BorderLayout.EAST);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Random random = new Random();
        double moneyEntered = Double.parseDouble(
                JOptionPane.showInputDialog("Enter the amount of money you want to enter into the slot machine:")
        );
        totalMoneyEntered += moneyEntered;

        // Select three random words and display corresponding images
        String[] selectedWords = new String[3];
        for (int i = 0; i < 3; i++) {
            int index = random.nextInt(words.length);
            selectedWords[i] = words[index];
            slotLabels[i].setIcon(new ImageIcon(imagePaths[index]));
        }

        // Determine winnings
        double winnings = 0;
        if (selectedWords[0].equals(selectedWords[1]) && selectedWords[1].equals(selectedWords[2])) {
            winnings = moneyEntered * 3;
            resultLabel.setText("Congratulations! All three words match. You win $" + winnings);
        } else if (selectedWords[0].equals(selectedWords[1]) || selectedWords[1].equals(selectedWords[2]) || selectedWords[0].equals(selectedWords[2])) {
            winnings = moneyEntered * 2;
            resultLabel.setText("Congratulations! Two words match. You win $" + winnings);
        } else {
            resultLabel.setText("No matches. You win $0.");
        }

        totalMoneyWon += winnings;
        totalEnteredLabel.setText("Total Money Entered: $" + totalMoneyEntered);
        totalWonLabel.setText("Total Money Won: $" + totalMoneyWon);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ECasino slotMachine = new ECasino();
            slotMachine.setVisible(true);
        });
    }
}
