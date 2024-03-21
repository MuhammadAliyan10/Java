import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class App extends JFrame implements ActionListener {
    private JLabel name, email, password, Gender, dateOfBirth;
    private JButton Submit;
    private JRadioButton maleR, femaleR;
    private ButtonGroup buttonGroup;
    private JPasswordField passwordF;
    private JTextField nameF, emailF;
    private JComboBox<String> dayComboBox, monthComboBox, yearComboBox;

    App() {
        // !Base
        setVisible(true);
        setSize(1000, 500);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.black);
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ! Components
        name = new JLabel("Name : ");
        name.setBounds(50, 50, 100, 100);
        name.setForeground(Color.WHITE);
        name.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
        add(name);

        nameF = new JTextField();
        nameF.setBounds(130, 90, 250, 30);
        nameF.setForeground(Color.BLACK);
        nameF.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
        add(nameF);

        email = new JLabel("Email : ");
        email.setBounds(50, 100, 100, 100);
        email.setForeground(Color.WHITE);
        email.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
        add(email);

        emailF = new JTextField();
        emailF.setBounds(130, 140, 250, 30);
        emailF.setForeground(Color.BLACK);
        emailF.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
        add(emailF);

        password = new JLabel("Password : ");
        password.setBounds(50, 150, 100, 100);
        password.setForeground(Color.WHITE);
        password.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
        add(password);

        passwordF = new JPasswordField();
        passwordF.setBounds(150, 190, 230, 30);
        passwordF.setForeground(Color.BLACK);
        passwordF.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
        add(passwordF);

        Gender = new JLabel("Gender: ");
        Gender.setBounds(50, 200, 100, 100);
        Gender.setForeground(Color.WHITE);
        Gender.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
        add(Gender);

        maleR = new JRadioButton("Male ");
        maleR.setBounds(130, 240, 70, 30);
        maleR.setForeground(Color.WHITE);
        maleR.setBackground(Color.BLACK);
        maleR.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
        add(maleR);

        femaleR = new JRadioButton("Female ");
        femaleR.setBounds(210, 240, 100, 30);
        femaleR.setForeground(Color.WHITE);
        femaleR.setBackground(Color.BLACK);
        femaleR.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
        add(femaleR);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(maleR);
        buttonGroup.add(femaleR);

        dateOfBirth = new JLabel("DOB: ");
        dateOfBirth.setBounds(50, 250, 100, 100);
        dateOfBirth.setForeground(Color.WHITE);
        dateOfBirth.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
        add(dateOfBirth);

        String days[] = new String[31];
        String months[] = new String[12];
        String years[] = new String[125];
        // ! Combo box for days
        for (int i = 1; i <= days.length; i++) {
            days[i - 1] = String.valueOf(i);
        }
        dayComboBox = new JComboBox<>(days);
        // ! Combo box for months
        for (int i = 1; i <= months.length; i++) {
            months[i - 1] = String.valueOf(i);
        }
        monthComboBox = new JComboBox<>(months);
        // ! Combo box for days
        for (int i = 2024; i >= 1900; i--) {
            years[2024 - i] = String.valueOf(i);
        }
        yearComboBox = new JComboBox<>(years);

        dayComboBox.setBounds(130, 300, 50, 30);
        add(dayComboBox);
        monthComboBox.setBounds(200, 300, 50, 30);
        add(monthComboBox);
        yearComboBox.setBounds(270, 300, 70, 30);
        add(yearComboBox);

        Submit = new JButton("Submit");
        Submit.setBounds(800, 400, 100, 50);
        Submit.setForeground(Color.BLACK);
        Submit.setBackground(Color.white);
        Submit.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
        Submit.addActionListener(this);
        add(Submit);
    };

    public void saveDataIntoDatabase(String name, String email, String password, String gender, String dateOfBirth) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop", "aliyan", "12345678");
                PreparedStatement pstmt = con.prepareStatement(
                        "INSERT INTO information (name, email, password, gender, dateOfBirth) VALUES (?, ?, ?, ?, ?)")) {
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, password);
            pstmt.setString(4, gender);
            pstmt.setString(5, dateOfBirth);
            pstmt.executeUpdate();
            System.out.println("Data inserted successfully.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Submit) {

            String name = nameF.getText();
            String email = emailF.getText();
            char[] passwordChar = passwordF.getPassword();
            String password = new String(passwordChar);
            String day = (String) dayComboBox.getSelectedItem();
            String month = (String) monthComboBox.getSelectedItem();
            String year = (String) yearComboBox.getSelectedItem();
            String dateOfBirth = day + "/" + month + "/" + year;
            String gender = "Not Selected";
            if (maleR.isSelected()) {
                gender = "Male";
            }
            if (femaleR.isSelected()) {
                gender = "Female";
            }
            if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill all the fields", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                saveDataIntoDatabase(name, email, password, gender, dateOfBirth);
            }
        }

    }

    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new App();
            }
        });
    }
}
