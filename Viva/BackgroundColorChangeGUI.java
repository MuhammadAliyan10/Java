import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BackgroundColorChangeGUI extends JFrame implements ActionListener {
    private JLabel label;
    private JButton redButton;
    private JButton blackButton;

    public BackgroundColorChangeGUI() {
        setTitle("Background Color Change");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create label
        label = new JLabel("BSCS", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 24));
        label.setOpaque(true); // Set the label to be opaque

        // Create buttons
        redButton = new JButton("Red");
        redButton.addActionListener(this);

        blackButton = new JButton("Black");
        blackButton.addActionListener(this);

        // Layout
        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.add(label);
        panel.add(redButton);
        panel.add(blackButton);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            label.setBackground(Color.RED);
            label.setForeground(Color.WHITE); // Change text color for better visibility
        } else if (e.getSource() == blackButton) {
            label.setBackground(Color.BLACK);
            label.setForeground(Color.WHITE);
        }
    }

    public static void main(String[] args) {
        new BackgroundColorChangeGUI();
    }
}