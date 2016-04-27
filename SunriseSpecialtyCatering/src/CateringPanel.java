import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class CateringPanel extends JFrame {
    private GreetingsPanel greetingsPanel = new GreetingsPanel();
    private MainDishPanel dishPanel = new MainDishPanel();
    private SideDishPanel sideDishPanel = new SideDishPanel();
    private DessertPanel dessertPanel = new DessertPanel();
    private JPanel buttonPanel = new JPanel();
    private JButton calcButton = new JButton("Calculate Charges");
    private JButton exitButton = new JButton("EXIT");

    public CateringPanel() {
        super("Sunrise Specialty Catering");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        buttonPanel.add(calcButton);
        buttonPanel.add(exitButton);
        calcButton.addActionListener(new CalcButtonListener());
        exitButton.addActionListener(new ExitButtonListener());

        setLayout(new BorderLayout());

        add(greetingsPanel, BorderLayout.NORTH);
        add(dishPanel, BorderLayout.WEST);
        add(sideDishPanel, BorderLayout.CENTER);
        add(dessertPanel, BorderLayout.EAST);
        add(buttonPanel, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    private class CalcButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            double mainDishPrice; // Main dish prices
            double sideDishPrice; // Side dish prices
            double dessertPrice; // Dessert prices

            // Get the food prices.
            mainDishPrice = dishPanel.getMdishPrice();
            sideDishPrice = sideDishPanel.getSdishPrice();
            dessertPrice = dessertPanel.getDessertPrice();

            // Get all the food price combined
            double allFoodPriceNum = mainDishPrice + sideDishPrice + dessertPrice;

            // Storing the food prices in currency format
            String allFoodPrice = NumberFormat.getCurrencyInstance()
                    .format(allFoodPriceNum);

            // Calculate the tax
            double getTax = allFoodPriceNum * 0.08875;

            // Storing the tax amount in currency format
            String tax = NumberFormat.getCurrencyInstance().format(getTax);

            // Calculating the grand total and formatting it in local currency
            String grandTotal = NumberFormat.getCurrencyInstance().format(getTax + allFoodPriceNum);

            // Display the message.
            JOptionPane.showMessageDialog(null,
                    "Price: " + allFoodPrice + "\n" + " TAX: " + tax + "\n" + " Grand Total: " + grandTotal);
        }
    }

    private class ExitButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}