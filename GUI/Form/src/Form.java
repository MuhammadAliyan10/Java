import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form extends JFrame implements ActionListener {
    private JTextField usernameTextField, departmentTextField, rollNumberTextField, emailTextField;
    JPasswordField passwordTextField;
    private JRadioButton maleRadioButton, femaleRadioButton;
    ButtonGroup buttonGroup;
    private JButton submitButton, resultForm;

    Form() {

        // !GUI Basix Edit
        setTitle("Student Information Form");
        getContentPane().setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // !GUI Size Edit
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
        // !Main Heading
        JLabel form = new JLabel("Student Information Form");
        form.setBounds(400, 50, 300, 20);
        form.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 20));
        form.setForeground(new Color(236, 80, 227));
        add(form);

        // ?Form Start

        // !Username
        JLabel username = new JLabel("Username : ");
        username.setBounds(50, 108, 120, 20);
        username.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 16));
        username.setForeground(new Color(236, 80, 227));
        add(username);
        usernameTextField = new JTextField();
        usernameTextField.setBounds(200, 108, 300, 30);
        usernameTextField.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
        usernameTextField.setForeground(new Color(140, 220, 255));
        usernameTextField.setBackground(Color.BLACK);
        usernameTextField.setCaretColor(new Color(140, 220, 255));
        usernameTextField.setBorder(BorderFactory.createLineBorder(new Color(236, 80, 227), 1));
        add(usernameTextField);

        // !Department
        JLabel department = new JLabel("Department : ");
        department.setBounds(50, 168, 120, 20); // Adjusted y-coordinate
        department.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 16));
        department.setForeground(new Color(236, 80, 227));
        add(department);
        departmentTextField = new JTextField();
        departmentTextField.setBounds(200, 168, 300, 30); // Adjusted y-coordinate
        departmentTextField.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
        departmentTextField.setForeground(new Color(140, 220, 255));
        departmentTextField.setBackground(Color.BLACK);
        departmentTextField.setCaretColor(new Color(140, 220, 255));
        departmentTextField.setBorder(BorderFactory.createLineBorder(new Color(236, 80, 227), 1));
        add(departmentTextField);

        // !Roll Number
        JLabel rollNumber = new JLabel("Roll Number : ");
        rollNumber.setBounds(50, 228, 120, 20); // Adjusted y-coordinate
        rollNumber.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 16));
        rollNumber.setForeground(new Color(236, 80, 227));
        add(rollNumber);
        rollNumberTextField = new JTextField();
        rollNumberTextField.setBounds(200, 228, 300, 30); // Adjusted y-coordinate
        rollNumberTextField.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
        rollNumberTextField.setForeground(new Color(140, 220, 255));
        rollNumberTextField.setBackground(Color.BLACK);
        rollNumberTextField.setCaretColor(new Color(140, 220, 255));
        rollNumberTextField.setBorder(BorderFactory.createLineBorder(new Color(236, 80, 227), 1));
        add(rollNumberTextField);

        // !Email
        JLabel Email = new JLabel("Email : ");
        Email.setBounds(50, 288, 120, 20); // Adjusted y-coordinate
        Email.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 16));
        Email.setForeground(new Color(236, 80, 227));
        add(Email);
        emailTextField = new JTextField();
        emailTextField.setBounds(200, 288, 300, 30); // Adjusted y-coordinate
        emailTextField.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
        emailTextField.setForeground(new Color(140, 220, 255));
        emailTextField.setBackground(Color.BLACK);
        emailTextField.setCaretColor(new Color(140, 220, 255));
        emailTextField.setBorder(BorderFactory.createLineBorder(new Color(236, 80, 227), 1));
        add(emailTextField);

        // !Password
        JLabel Password = new JLabel("Password : ");
        Password.setBounds(50, 348, 120, 20); // Adjusted y-coordinate
        Password.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 16));
        Password.setForeground(new Color(236, 80, 227));
        add(Password);
        passwordTextField = new JPasswordField();
        passwordTextField.setBounds(200, 348, 300, 30); // Adjusted y-coordinate
        passwordTextField.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
        passwordTextField.setForeground(new Color(140, 220, 255));
        passwordTextField.setBackground(Color.BLACK);
        passwordTextField.setCaretColor(new Color(140, 220, 255));
        passwordTextField.setBorder(BorderFactory.createLineBorder(new Color(236, 80, 227), 1));
        add(passwordTextField);

        // !Password
        JLabel Gender = new JLabel("Gender : ");
        Gender.setBounds(50, 398, 120, 20); // Adjusted y-coordinate
        Gender.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 16));
        Gender.setForeground(new Color(236, 80, 227));
        add(Gender);

        // *Radin Buttons */
        maleRadioButton = new JRadioButton("Male");
        maleRadioButton.setBounds(200, 430, 100, 45);
        maleRadioButton.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 16));
        maleRadioButton.setForeground(new Color(236, 80, 227));
        maleRadioButton.setBackground(Color.BLACK);
        add(maleRadioButton);
        femaleRadioButton = new JRadioButton("Female");
        femaleRadioButton.setBounds(300, 430, 100, 45);
        femaleRadioButton.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 16));
        femaleRadioButton.setForeground(new Color(236, 80, 227));
        femaleRadioButton.setBackground(Color.BLACK);
        add(femaleRadioButton);
        buttonGroup = new ButtonGroup();
        buttonGroup.add(maleRadioButton);
        buttonGroup.add(femaleRadioButton);

        // ?Sudmit Button
        submitButton = new JButton("Information");
        submitButton.setBounds(650, 470, 100, 30);
        submitButton.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 13));
        submitButton.setBackground(Color.BLACK);
        submitButton.setBorder(BorderFactory.createLineBorder(new Color(236, 80, 227), 2));
        submitButton.setForeground(new Color(140, 220, 255));
        submitButton.addActionListener(this);
        add(submitButton);

        resultForm = new JButton("Check Result");
        resultForm.setBounds(800, 470, 100, 30);
        resultForm.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 13));
        resultForm.setBackground(Color.BLACK);
        resultForm.setBorder(BorderFactory.createLineBorder(new Color(236, 80, 227), 2));
        resultForm.setForeground(new Color(140, 220, 255));
        resultForm.addActionListener(this);
        add(resultForm);

    }

    public void actionPerformed(ActionEvent ae) {
        String usernameField = usernameTextField.getText().trim();
        String departmentField = departmentTextField.getText().trim();
        String emailField = emailTextField.getText().trim();
        String rollNumberField = rollNumberTextField.getText().trim();
        char[] passwordCharsL = passwordTextField.getPassword();
        String passwordField = new String(passwordCharsL).trim();
        if (usernameField.isEmpty() && departmentField.isEmpty() && passwordField.isEmpty()
                && rollNumberField.isEmpty() && emailField.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Sudmit your form to get final result.", "Error",
                    JOptionPane.ERROR_MESSAGE);

        } else if (departmentField.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter your department.", "Error",
                    JOptionPane.ERROR_MESSAGE);

        } else if (rollNumberField.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter your Roll Number.", "Error",
                    JOptionPane.ERROR_MESSAGE);

        } else if (emailField.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter your email.", "Error",
                    JOptionPane.ERROR_MESSAGE);

        } else if (passwordField.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter your password.", "Error",
                    JOptionPane.ERROR_MESSAGE);

        } else if (usernameField.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter your name.", "Error",
                    JOptionPane.ERROR_MESSAGE);

        } else {
            if (ae.getSource() == submitButton) {

                setVisible(false);
                String gender = "Not Specified";
                String username = usernameTextField.getText();
                String department = departmentTextField.getText();
                String email = emailTextField.getText();
                String rollNumber = rollNumberTextField.getText();

                if (maleRadioButton.isSelected()) {
                    gender = "Male";

                } else if (femaleRadioButton.isSelected()) {
                    gender = "Female";

                }

                new Information(username, department, email, rollNumber, gender);
            } else if (ae.getSource() == resultForm) {
                String email = emailTextField.getText();
                char[] passwordChars = passwordTextField.getPassword();
                String password = new String(passwordChars);
                String gender = "Not Specified";
                String username = usernameTextField.getText();
                String department = departmentTextField.getText();
                String rollNumber = rollNumberTextField.getText();
                if (maleRadioButton.isSelected()) {
                    gender = "Male";

                } else if (femaleRadioButton.isSelected()) {
                    gender = "Female";

                }
                new ResultForm(email, password, username, rollNumber, department, gender);
                setVisible(false);

            }
        }

    }

    public static void main(String[] args) {
        new Form();
    }

}
