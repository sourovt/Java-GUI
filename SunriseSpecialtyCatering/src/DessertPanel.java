import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class DessertPanel extends JPanel {
    private final double NADA_PRICE = 0;
    private final double CAKE_PRICE = 2.25;
    private final double APPLEPIE_PRICE = 1.50;
    private final double PUDDING_PRICE = 2.50;

    private JRadioButton noneButton = new JRadioButton("None");
    private JRadioButton cCakeButton = new JRadioButton("Choclate Cake");
    private JRadioButton applePieButton = new JRadioButton("Apple Pie");
    private JRadioButton bPuddingButton = new JRadioButton("Butterscotch Pudding");

    private ButtonGroup dessertButtonGroup = new ButtonGroup();

    public DessertPanel() {
        dessertButtonGroup.add(noneButton);
        dessertButtonGroup.add(cCakeButton);
        dessertButtonGroup.add(applePieButton);
        dessertButtonGroup.add(bPuddingButton);

        add(noneButton);
        add(cCakeButton);
        add(applePieButton);
        add(bPuddingButton);

        setLayout(new GridLayout(4, 1));
        setBorder(BorderFactory.createTitledBorder("Desserts"));
    }

    public double getDessertPrice() {
        double price = 0;

        if (noneButton.isSelected()) {
            price = NADA_PRICE;
        }
        if (cCakeButton.isSelected()) {
            price = CAKE_PRICE;
        }
        if (applePieButton.isSelected()) {
            price = APPLEPIE_PRICE;
        }
        if (bPuddingButton.isSelected()) {
            price = PUDDING_PRICE;
        }

        return price;
    }
}