import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CardLayoutExample {
    public JFrame group2;
    public JPanel group2Members;
    public CardLayout group;

    public CardLayoutExample() {
        group2 = new JFrame("CardLayout");
        group2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        group2.setSize(400, 300);
        group2.setLocationRelativeTo(null);
        group = new CardLayout();
        group2Members = new JPanel(group);
        JPanel card1 = createCard("This is Card One", "Go to Card Two", "Card2");
        JPanel card2 = createCard("This is Card Two", "Go to Card Three", "Card3");
        JPanel card3 = createCard("This is Card Three", "Go to Card One", "Card1");

    }
}
