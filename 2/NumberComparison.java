import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberComparison extends JFrame implements ActionListener {
    private JTextField textField1, textField2;
    private JLabel label1, label2;
    private JButton compareButton;

    public NumberComparison() {
        setTitle("Number Comparison");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Creating labels
        label1 = new JLabel("Number 1:");
        label2 = new JLabel("Number 2:");
        
        // Creating text fields
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        
        // Creating button
        compareButton = new JButton("Compare");
        
        // Adding action listener to the button
        compareButton.addActionListener(this);
        
        // Setting layout
        setLayout(new GridLayout(3, 2));
        
        // Adding components to the frame
        add(label1);
        add(textField1);
        add(label2);
        add(textField2);
        add(compareButton);
    }

    public void actionPerformed(ActionEvent e) {
        // Getting text from text fields
        String num1Str = textField1.getText();
        String num2Str = textField2.getText();
        
        // Parsing text to integers
        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);
        
        // Comparing numbers
        if (num1 == num2) {
            JOptionPane.showMessageDialog(this, "Numbers are equal");
        } else {
            JOptionPane.showMessageDialog(this, "Numbers are not equal");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new NumberComparison().setVisible(true);
            }
        });
    }
}
