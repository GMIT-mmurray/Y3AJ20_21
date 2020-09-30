// Fig. 12.9: TextFieldFrame.java
// JTextFields and JPasswordFields.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame 
{
   private final JTextField textField1; // text field with set size
   private final JTextField textField2; // text field with text
   private  JTextField textField3; // text field with text and size
   private final JPasswordField passwordField; // password field with text

   // TextFieldFrame constructor adds JTextFields to JFrame
   public TextFieldFrame()
   {
      super("Testing JTextField and JPasswordField");
      setLayout(new FlowLayout());

      // construct textfield with 10 columns
      textField1 = new JTextField(10);
      textField1.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent event) {
            String string = String.format("%s", event.getActionCommand());
            JOptionPane.showMessageDialog(null, string);
            if (string.equals("three")) {
               textField3.setEditable(true);
               textField3.setText("I am alive");
            }
         }
      });
      add(textField1); // add textField1 to JFrame

      // construct textfield with default text
      textField2 = new JTextField("Enter text here");
      textField2.addActionListener(e -> {
         String string = String.format("%s", e.getActionCommand());
         JOptionPane.showMessageDialog(null, string);
         if (string.equals("THREE"))
            textField3.setEditable(false);
      });add(textField2); // add textField2 to JFrame

      // construct textfield with default text and 21 columns
      textField3 = new JTextField("Uneditable text field", 21);
      textField3.setEditable(false); // disable editing
      textField3.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String string = String.format("%s", e.getActionCommand());
            JOptionPane.showMessageDialog(null, string);
         }
      }); add(textField3); // add textField3 to JFrame

      // construct passwordfield with default text
      passwordField = new JPasswordField("Hidden text");
      passwordField.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String string = String.format("%s", e.getActionCommand());
            JOptionPane.showMessageDialog(null, string);
         }
      });
      add(passwordField); // add passwordField to JFrame

   } // end TextFieldFrame constructor

} // end class TextFieldFrame

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
