import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Information extends JFrame implements ActionListener {
    String username, department, email, rollNumber, gender;
    JButton back;

    Information(String username, String department, String email, String rollNumber, String gender) {
        this.username = username;
        this.department = department;
        this.email = email;
        this.rollNumber = rollNumber;
        this.gender = gender;

        // !GUI Basix Edit
        setTitle("Student Information");
        getContentPane().setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // !GUI Size Edit
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
        // !Main Heading
        JLabel form = new JLabel("Student Information");
        form.setBounds(400, 50, 300, 20);
        form.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 20));
        form.setForeground(new Color(236, 80, 227));
        add(form);

        JLabel name = new JLabel("The name of the student is " + username + ".");
        name.setBounds(100, 150, 1000, 45);
        name.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 16));
        name.setForeground(new Color(140, 220, 255));
        add(name);
        JLabel rollNumberT = new JLabel("The roll number of the student is " + rollNumber + ".");
        rollNumberT.setBounds(100, 190, 1000, 45);
        rollNumberT.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 16));
        rollNumberT.setForeground(new Color(140, 220, 255));
        add(rollNumberT);
        JLabel dep = new JLabel("The student belongs to the department " + department + ".");
        dep.setBounds(100, 230, 1000, 45);
        dep.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 16));
        dep.setForeground(new Color(140, 220, 255));
        add(dep);
        JLabel em = new JLabel("The email of the student is  " + email + ".");
        em.setBounds(100, 270, 1000, 45);
        em.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 16));
        em.setForeground(new Color(140, 220, 255));
        add(em);
        JLabel gen = new JLabel("The gender is " + gender + ".");
        gen.setBounds(100, 310, 1000, 45);
        gen.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 16));
        gen.setForeground(new Color(140, 220, 255));
        add(gen);
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
        if (ae.getSource() == back) {
            setVisible(false);
            new Form();

        }
    }

    public static void main(String[] args) {
        new Information("Student", "Unknown", "student@gmail.com", "000", "Not Specified");
    }
}
