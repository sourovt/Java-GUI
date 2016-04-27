import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

@SuppressWarnings("serial")
public class GreetingsPanel extends JPanel {
    JLabel greetings = new JLabel("Welcome To Sunrise Specialty Catering");

    public GreetingsPanel() {
        setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        add(greetings);

    }

}
	
