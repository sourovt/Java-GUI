import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class MainDishPanel extends JPanel {
    private final double BMLOAF_PRICE = 70;
    private final double BBQCHICKEN_RATE = 60;
    private final double GSALMON_RATE = 20;
    private final double PASTA_RATE = 40;

    private JRadioButton bLoafButton = new JRadioButton("Beef Meat Loaf");
    private JRadioButton bChickenButton = new JRadioButton("BBQ Chicken Pieces");
    private JRadioButton gSalmonButton = new JRadioButton("Grilled Salmon");
    private JRadioButton pastaButton = new JRadioButton("Pasta Prima Vera");

    private ButtonGroup dishButtons = new ButtonGroup();

    public MainDishPanel() {
        dishButtons.add(bLoafButton);
        dishButtons.add(bChickenButton);
        dishButtons.add(gSalmonButton);
        dishButtons.add(pastaButton);

        add(bLoafButton);
        add(bChickenButton);
        add(gSalmonButton);
        add(pastaButton);

        setLayout(new GridLayout(4, 1));
        setBorder(BorderFactory.createTitledBorder("Main Dishes"));
    }

    public double getMdishPrice() {
        double price = 0;

        if (bLoafButton.isSelected()) {
            price = BMLOAF_PRICE;
        } else if (bChickenButton.isSelected()) {
            price = BBQCHICKEN_RATE;
        } else if (gSalmonButton.isSelected()) {
            price = GSALMON_RATE;
        } else if (pastaButton.isSelected()) {
            price = PASTA_RATE;
        }

        return price;
    }
}