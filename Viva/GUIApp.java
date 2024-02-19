import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIApp extends JFrame implements ActionListener {
    private JLabel nameLabel, idLabel, passwordLabel;
    private JTextField nameField, idField, passwordField;
    private JButton submitButton;

    public GUIApp() {
        // Set up the frame
        setTitle("GUI App");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        nameLabel = new JLabel("Name:");
        idLabel = new JLabel("ID:");
        passwordLabel = new JLabel("Password:");

        nameField = new JTextField(10);
        idField = new JTextField(10);
        passwordField = new JTextField(10);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        setLayout(new GridLayout(4, 2));
        add(nameLabel);
        add(nameField);
        add(idLabel);
        add(idField);
        add(passwordLabel);
        add(passwordField);
        add(new JLabel());
        add(submitButton);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            getContentPane().setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(this, "Submit Successful");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUIApp();
            }
        });
    }
}
