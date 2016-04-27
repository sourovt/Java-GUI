import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class SideDishPanel extends JPanel {
    private final double SALAD_PRICE = 6.50;
    private final double MVEG_PRICE = 9.50;
    private final double POTATO_PRICE = 5.50;
    private final double RICEDISH_PRICE = 7.75;
    private final double BEAN_PRICE = 6.75;
    private final double BREAD_PRICE = 4.00;

    private JCheckBox saladCB = new JCheckBox("Salad");
    private JCheckBox mVegCB = new JCheckBox("Mixed Vegetable");
    private JCheckBox potatoCB = new JCheckBox("Potatoes");
    private JCheckBox riceDishCB = new JCheckBox("Rice Dishes");
    private JCheckBox beanCB = new JCheckBox("Beans");
    private JCheckBox breadCB = new JCheckBox("Breads");

    public SideDishPanel() {
        add(saladCB);
        add(mVegCB);
        add(potatoCB);
        add(riceDishCB);
        add(beanCB);
        add(breadCB);

        setLayout(new GridLayout(3, 2));
        setBorder(BorderFactory.createTitledBorder("Side Dishes"));
    }

    public double getSdishPrice() {
        double price = 0;

        if (saladCB.isSelected()) {
            price += SALAD_PRICE;
        }
        if (mVegCB.isSelected()) {
            price += MVEG_PRICE;
        }
        if (potatoCB.isSelected()) {
            price += POTATO_PRICE;
        }
        if (riceDishCB.isSelected()) {
            price += RICEDISH_PRICE;
        }
        if (beanCB.isSelected()) {
            price += BEAN_PRICE;
        }
        if (breadCB.isSelected()) {
            price += BREAD_PRICE;
        }

        return price;
    }
}