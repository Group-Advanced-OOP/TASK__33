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
    }
}
