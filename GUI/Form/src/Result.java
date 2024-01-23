import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Result extends JFrame implements ActionListener {
    String day, month, year, name, department, rollNumber, gender;
    JButton exit, mode;

    Result(String d, String m, String y, String n, String rn, String dep, String g) {
        this.day = d;
        this.month = m;
        this.year = y;
        this.name = n;
        this.department = dep;
        this.rollNumber = rn;
        this.gender = g;
        int yearNow = 2024;
        int yearFinal = Integer.parseInt(year);

        // !GUI Basix Edit
        setTitle("Result");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);
        // !GUI Size Edit
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
        // !Main Heading
        JLabel form = new JLabel("Student Result");
        form.setBounds(400, 50, 300, 20);
        form.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 17));
        form.setForeground(new Color(236, 80, 227));
        add(form);
        JLabel nameL = new JLabel("The name of the student is " + name + ".");
        nameL.setBounds(50, 100, 800, 20);
        nameL.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 17));
        nameL.setForeground(new Color(236, 80, 227));
        add(nameL);
        JLabel depL = new JLabel(name + " belongs to the department " + department + ".");
        depL.setBounds(50, 150, 800, 20);
        depL.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 17));
        depL.setForeground(new Color(236, 80, 227));
        add(depL);
        JLabel rollNumL = new JLabel(name + " roll number is " + rollNumber + ".");
        rollNumL.setBounds(50, 200, 800, 20);
        rollNumL.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 17));
        rollNumL.setForeground(new Color(236, 80, 227));
        add(rollNumL);
        JLabel dob = new JLabel("Date of birth of student " + name + " is " + day + "/" + month + "/" + year + ".");
        dob.setBounds(50, 250, 800, 20);
        dob.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 17));
        dob.setForeground(new Color(236, 80, 227));
        add(dob);
        JLabel genL = new JLabel("The gender of the student is " + gender + ".");
        genL.setBounds(50, 300, 800, 20);
        genL.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 17));
        genL.setForeground(new Color(236, 80, 227));
        add(genL);
        JLabel age = new JLabel("The age of the student is " + (yearNow - yearFinal) + ".");
        age.setBounds(50, 350, 800, 20);
        age.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 17));
        age.setForeground(new Color(236, 80, 227));
        add(age);
        exit = new JButton("Back to Start");
        exit.setBounds(770, 470, 170, 30);
        exit.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
        exit.setBackground(Color.BLACK);
        exit.setBorder(BorderFactory.createLineBorder(new Color(236, 80, 227), 2));
        exit.setForeground(new Color(140, 220, 255));
        exit.addActionListener(this);
        add(exit);

        JToggleButton mode = new JToggleButton("Light Mode");
        mode.setBounds(700, 20, 150, 40);
        add(mode);
        mode.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    mode.setText("Dark Mode");
                    getContentPane().setBackground(Color.WHITE);
                    exit.setBackground(Color.WHITE);

                } else {
                    mode.setText("Light Mode");
                    getContentPane().setBackground(Color.BLACK);
                    exit.setBackground(Color.BLACK);
                }
            }
        });

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == exit) {
            setVisible(false);
            new Wellcome();

        }

    }

    public static void main(String[] args) {
        new Result("2004", "18", "1", "Unknown", "123", "False", "Not Specified");
    }
}
