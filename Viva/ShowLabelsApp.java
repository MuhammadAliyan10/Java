import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShowLabelsApp extends JFrame implements ActionListener {
    private JLabel nameLabel, programLabel;

    public ShowLabelsApp() {
        setTitle("Show Labels App");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        nameLabel = new JLabel(" mahar Noor ul ain");
        nameLabel.setVisible(false);

        programLabel = new JLabel("Program: BSCS");
        programLabel.setVisible(false);

        JButton nameButton = new JButton("Show Name");
        nameButton.addActionListener(this);

        JButton programButton = new JButton("Show Program");
        programButton.addActionListener(this);

        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.add(nameLabel);
        panel.add(nameButton);
        panel.add(programLabel);
        panel.add(programButton);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Show Name")) {
            nameLabel.setVisible(true);
        } else if (e.getActionCommand().equals("Show Program")) {
            programLabel.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new ShowLabelsApp();
    }
}