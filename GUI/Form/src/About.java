import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class About extends JFrame implements ActionListener {
    JButton back;

    About() {

        // ! GUI Edit
        setTitle("About Us");
        getContentPane().setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);

        // ! GUI Display
        setVisible(true);
        setSize(1000, 600);
        setLocationRelativeTo(null);

        // ! Heading
        JLabel heading = new JLabel("Wellcome To University of Lahore");
        heading.setBounds(280, 30, 900, 45);
        heading.setFont(new Font(Font.SANS_SERIF, Font.LAYOUT_LEFT_TO_RIGHT, 26));
        heading.setForeground(new Color(236, 80, 227));
        add(heading);
        // ! Rules
        JLabel rules = new JLabel();
        rules.setBounds(40, 65, 900, 450);
        rules.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));
        rules.setForeground(new Color(140, 220, 255));
        rules.setText(
                "<html>" +
                        "The University of Lahore (Punjabi: لہور یونیورسٹی; Urdu: جامعہ لاہور), abbreviated as UOL." +
                        "It is a private university located in Lahore, Punjab, Pakistan." +
                        "Its founding owner is M.A. Raoof." +
                        "It was founded at the collegiate level in 1999 under the IBADAT Educational Trust and was granted full degree-awarding status in 2002."
                        +
                        "The University of Lahore (UOL) has 2 campuses in Lahore, 2 campuses in Islamabad, and one in Sargodha."
                        +
                        "The University has also achieved the highest W4 category ranking with the Higher Education Commission (HEC) of Pakistan."
                        +
                        "The University of Lahore has 7 campuses, 11 academic faculties, 35 academic departments, 3 technology parks, 2 research centres, Alumni network of 23000+, and 150+ degree programs and teaches 3,000+ courses. The Total Student Body in all campuses comes to around 36,000+."
                        +
                        "Pakistan Journal of Molecular Medicine (Pakistan J. Mol. Med.) is a semi-annual (6 monthly) journal, being published by the Institute of Molecular Biology and Biotechnology (IMBB)."
                        +
                        "JMBSS is a specified, peer-reviewed and professional journal that is published bi-annually in both print and electronic forms by University of Lahore, Pakistan."
                        + "<br><br>" +
                        "QS World University Rankings (#1001-1200)" + "<br><br>" +
                        "Asia University Rankings (#301-350)" + "<br><br>" +
                        "Times Higher Education (#801)" + "<br><br>" +
                        "University Web Rankings (#31)"

                        +
                        "</html>");
        add(rules);

        // ! Back Button
        back = new JButton("Back");
        back.setBounds(850, 500, 100, 30);
        back.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 13));
        back.setBackground(Color.BLACK);
        back.setBorder(BorderFactory.createLineBorder(new Color(236, 80, 227), 1));
        back.setForeground(new Color(140, 220, 255));
        back.addActionListener(this);
        add(back);

    }

    // ! Button Event handler

    public void actionPerformed(ActionEvent ac) {
        if (ac.getSource() == back) {
            new Wellcome();
            setVisible(false);
        }

    }

    public static void main(String[] args) {

        new About();

    }

}