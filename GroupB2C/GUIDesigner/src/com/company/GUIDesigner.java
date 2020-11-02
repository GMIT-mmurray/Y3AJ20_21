package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIDesigner {
    private JPanel GUIDesigner;
    private JTextField enterSomeValueTextField;
    private JButton button1;
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;

    public GUIDesigner() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Parse degrees Celsius as a double and convert to Fahrenheit.
                int tempFahr = (int)((Double.parseDouble(enterSomeValueTextField.getText()))
                        * 1.8 + 32);
                label1.setText(tempFahr + " Fahrenheit");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("GUIDesigner");
                frame.setContentPane(new GUIDesigner().GUIDesigner);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });

    }
}
