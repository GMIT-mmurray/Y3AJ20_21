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
   private final JTextField textField3; // text field with text and size
   private final JPasswordField passwordField; // password field with text

   // TextFieldFrame constructor adds JTextFields to JFrame
   public TextFieldFrame()
   {
      super("Testing JTextField and JPasswordField");
      setLayout(new FlowLayout());

      // construct textfield with 10 columns
      textField1 = new JTextField(10); 
      add(textField1); // add textField1 to JFrame

      // construct textfield with default text
      textField2 = new JTextField("Enter text here");
      add(textField2); // add textField2 to JFrame

      // construct textfield with default text and 21 columns
      textField3 = new JTextField("Uneditable text field", 21);
      textField3.setEditable(false); // disable editing
      add(textField3); // add textField3 to JFrame

      // construct passwordfield with default text
      passwordField = new JPasswordField("Hidden text");
      add(passwordField); // add passwordField to JFrame

      textField1.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String string = String.format("textField1: %s",
                    e.getActionCommand());
            JOptionPane.showMessageDialog(null, string);
         }
      });
      textField2.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String string = String.format("textField2: %s",
                    e.getActionCommand());
            JOptionPane.showMessageDialog(null, string);
         }
      });
      textField3.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String string = String.format("textField3: %s",
                    e.getActionCommand());
            JOptionPane.showMessageDialog(null, string);
         }
      });
      passwordField.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String string = String.format("Password: %s",
                    e.getActionCommand());
            JOptionPane.showMessageDialog(null, string);
         }
      });
   } // end TextFieldFrame constructor

} // end class TextFieldFrame

