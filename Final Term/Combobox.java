import javax.swing.*;
import java.awt.*;

public class Combobox extends JFrame {
    private JComboBox<String> dayComboBox, monthComboBox, yearComboBox;

    public Combobox() {
        setVisible(true);
        setSize(800, 600);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        JLabel h = new JLabel("Hello");
        h.setBounds(200, 200, 200, 200);
        add(h);
        String days[] = new String[31];
        for (int i = 1; i <= days.length; i++) {
            days[i - 1] = String.valueOf(i);
        }
        dayComboBox = new JComboBox<>(days);

        String month[] = new String[12];
        for (int i = 1; i <= month.length; i++) {
            month[i - 1] = String.valueOf(i);

        }
        monthComboBox = new JComboBox<>(month);

        String year[] = new String[124];
        for (int i = 2024; i > 1900; i--) {
            year[2024 - i] = String.valueOf(i);
        }
        yearComboBox = new JComboBox<>(year);
        dayComboBox.setBounds(100, 300, 50, 30);

        dayComboBox.setForeground(new Color(236, 80, 227));
        dayComboBox.setBackground(Color.BLACK);
        monthComboBox.setBounds(200, 300, 50, 30);

        monthComboBox.setForeground(new Color(236, 80, 227));
        monthComboBox.setBackground(Color.BLACK);

        yearComboBox.setBounds(300, 300, 70, 30);
        yearComboBox.setForeground(new Color(236, 80, 227));
        yearComboBox.setBackground(Color.BLACK);
        add(dayComboBox);
        add(monthComboBox);
        add(yearComboBox);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Combobox();
            }
        });
    }
}