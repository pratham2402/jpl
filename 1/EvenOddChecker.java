import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EvenOddChecker extends JFrame implements ActionListener {
    private JTextField numberTextField;
    private JLabel resultLabel;

    public EvenOddChecker() {
        setTitle("Even Odd Checker");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Creating label
        JLabel numberLabel = new JLabel("Number:");
        
        // Creating text field
        numberTextField = new JTextField(10);
        
        // Creating button
        JButton checkButton = new JButton("Check");
        // Adding action listener to the button
        checkButton.addActionListener(this);
        
        // Creating label to display result
        resultLabel = new JLabel();
        
        // Setting layout
        setLayout(new GridLayout(3, 2));
        
        // Adding components to the frame
        add(numberLabel);
        add(numberTextField);
        add(checkButton);
        add(resultLabel);
    }

    public void actionPerformed(ActionEvent e) {
        // Getting text from text field
        String numberStr = numberTextField.getText();
        
        // Parsing text to integer
        int number = Integer.parseInt(numberStr);
        
        // Checking if the number is even or odd
        if (number % 2 == 0) {
            resultLabel.setText("Even");
        } else {
            resultLabel.setText("Odd");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new EvenOddChecker().setVisible(true);
            }
        });
    }
}
