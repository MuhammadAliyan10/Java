import javax.swing.*;
import java.awt.*;

public class Error extends JFrame {
    Error() {
        setTitle("Error");
        getContentPane().setBackground(Color.BLACK);

        // !GUI Size Edit
        setSize(400, 400);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);

        JLabel error = new JLabel("Password or Email does not match.");
        error.setBounds(65, 170, 400, 20); // Adjusted y-coordinate
        error.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 16));
        error.setForeground(new Color(236, 80, 227));
        add(error);

    }

    public static void main(String[] args) {
        new Error();
    }
}
