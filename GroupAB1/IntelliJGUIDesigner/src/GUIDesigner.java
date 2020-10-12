import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIDesigner {
    private JTextField enterTempInCTextField;
    private JButton button1;
    private JPanel panel1;
    private JLabel label1;
    private JLabel label2;

    public GUIDesigner() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempFahr = (int)((Double.parseDouble(enterTempInCTextField.getText()))
                        * 1.8 + 32);
                label2.setText(tempFahr + " Fahrenheit");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUIDesigner");
        frame.setContentPane(new GUIDesigner().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
