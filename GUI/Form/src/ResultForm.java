import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ResultForm extends JFrame implements ActionListener {
    String email, password, uname, rNum, dep, gen;
    JTextField emailField, passwordField;
    JButton result, back;
    private JComboBox<String> dayComboBox, monthComboBox, yearComboBox;

    ResultForm(String email, String password, String u, String rn, String d, String g) {
        this.email = email;
        this.password = password;
        this.uname = u;
        this.rNum = rn;
        this.dep = d;
        this.gen = g;

        // !GUI Basix Edit
        setTitle("Student Result Form");
        setResizable(false);
        getContentPane().setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // !GUI Size Edit
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
        // !Main Heading
        JLabel form = new JLabel("Student Information Form");
        form.setBounds(380, 50, 300, 20);
        form.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 20));
        form.setForeground(new Color(236, 80, 227));
        add(form);

        JLabel emailI = new JLabel("Confirm your email : ");
        emailI.setBounds(50, 140, 400, 20);
        emailI.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 16));
        emailI.setForeground(new Color(236, 80, 227));
        add(emailI);
        emailField = new JTextField();
        emailField.setBounds(220, 140, 300, 30);
        emailField.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
        emailField.setForeground(new Color(140, 220, 255));
        emailField.setBackground(Color.BLACK);
        emailField.setCaretColor(new Color(140, 220, 255));
        emailField.setBorder(BorderFactory.createLineBorder(new Color(236, 80, 227), 1));
        add(emailField);

        // !Department
        JLabel passwordL = new JLabel("Confirm your password: ");
        passwordL.setBounds(50, 200, 400, 20); // Adjusted y-coordinate
        passwordL.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 16));
        passwordL.setForeground(new Color(236, 80, 227));
        add(passwordL);
        passwordField = new JTextField();
        passwordField.setBounds(260, 200, 260, 30); // Adjusted y-coordinate
        passwordField.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
        passwordField.setForeground(new Color(140, 220, 255));
        passwordField.setBackground(Color.BLACK);
        passwordField.setCaretColor(new Color(140, 220, 255));
        passwordField.setBorder(BorderFactory.createLineBorder(new Color(236, 80, 227), 1));
        add(passwordField);

        JLabel dob = new JLabel("Your Date of Birth : ");
        dob.setBounds(50, 260, 600, 20); // Adjusted y-coordinate
        dob.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 16));
        dob.setForeground(new Color(236, 80, 227));
        add(dob);
        String[] days = new String[31];
        for (int i = 1; i <= 31; i++) {
            days[i - 1] = String.valueOf(i);
        }
        dayComboBox = new JComboBox<>(days);

        String[] month = new String[12];
        for (int i = 1; i <= 12; i++) {
            month[i - 1] = String.valueOf(i);
        }
        monthComboBox = new JComboBox<>(month);

        String[] years = new String[125]; // Adjusted array size
        for (int i = 2024; i >= 1900; i--) {
            years[2024 - i] = String.valueOf(i);
        }
        yearComboBox = new JComboBox<>(years);
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

        result = new JButton("Check Result");
        result.setBounds(800, 470, 100, 30);
        result.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 13));
        result.setBackground(Color.BLACK);
        result.setBorder(BorderFactory.createLineBorder(new Color(236, 80, 227), 2));
        result.setForeground(new Color(140, 220, 255));
        result.addActionListener(this);
        add(result);
        back = new JButton("Back");
        back.setBounds(650, 470, 100, 30);
        back.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 13));
        back.setBackground(Color.BLACK);
        back.setBorder(BorderFactory.createLineBorder(new Color(236, 80, 227), 2));
        back.setForeground(new Color(140, 220, 255));
        back.addActionListener(this);
        add(back);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == result) {
            String emailInput = emailField.getText().trim();
            String passwordInput = passwordField.getText().trim();
            if (emailInput.isEmpty() && passwordInput.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter email & password.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else if (passwordInput.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter your password.", "Error",
                        JOptionPane.ERROR_MESSAGE);

            } else if (emailInput.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter your email.", "Error",
                        JOptionPane.ERROR_MESSAGE);

            } else {
                String em = emailField.getText();
                String ps = passwordField.getText();
                if (em.equals(email) && ps.equals(password)) {
                    setVisible(false);
                    String selectedDay = (String) dayComboBox.getSelectedItem();
                    String selectedMonth = (String) monthComboBox.getSelectedItem();
                    String selectedYear = (String) yearComboBox.getSelectedItem();
                    new Result(selectedDay, selectedMonth, selectedYear, uname, rNum, dep, gen);

                } else {
                    new Error();

                }
            }
        } else if (ae.getSource() == back) {
            setVisible(false);
            new Form();

        }

    }

    public static void main(String[] args) {
        new ResultForm("student@gmail.com", "12345678", "Unknown", "123", "False", "Not Specified");
    }

}
