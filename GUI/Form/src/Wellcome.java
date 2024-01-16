import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Wellcome extends JFrame implements ActionListener {
    JButton start, about, exit;

    Wellcome() {

        // !GUI Basix Edit
        setTitle("UOL");
        getContentPane().setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // !GUI Size Edit
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
        // !Main Heading

        JLabel emailI = new JLabel("Wellcome to the University of Lahore");
        emailI.setBounds(270, 100, 800, 20);
        emailI.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 25));
        emailI.setForeground(new Color(236, 80, 227));
        add(emailI);

        start = new JButton("Start");
        start.setBounds(400, 170, 150, 30);
        start.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
        start.setBackground(Color.BLACK);
        start.setBorder(BorderFactory.createLineBorder(new Color(236, 80, 227), 2));
        start.setForeground(new Color(140, 220, 255));
        start.addActionListener(this);
        add(start);

        about = new JButton("About Us");
        about.setBounds(400, 220, 150, 30);
        about.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
        about.setBackground(Color.BLACK);
        about.setBorder(BorderFactory.createLineBorder(new Color(236, 80, 227), 2));
        about.setForeground(new Color(140, 220, 255));
        about.addActionListener(this);
        add(about);
        exit = new JButton("Exit");
        exit.setBounds(400, 270, 150, 30);
        exit.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));
        exit.setBackground(Color.BLACK);
        exit.setBorder(BorderFactory.createLineBorder(new Color(236, 80, 227), 2));
        exit.setForeground(new Color(140, 220, 255));
        exit.addActionListener(this);
        add(exit);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Form();
        } else if (ae.getSource() == about) {

        } else if (ae.getSource() == exit) {
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new Wellcome();
    }
}
