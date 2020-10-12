package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntelliJGUI {
    private JTextField textField1;
    private JPanel GUIDesigner;
    private JButton button1Button;
    private JLabel label2;
    private JLabel label1;


    public IntelliJGUI() {
        button1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello from GUI Designer");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("IntelliJGUI");
        frame.setContentPane(new IntelliJGUI().GUIDesigner);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
