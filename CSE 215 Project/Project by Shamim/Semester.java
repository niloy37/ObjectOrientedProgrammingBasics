package studentmanagementsystem;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Semester extends JFrame implements ActionListener {

    private Container c;
    private JButton backButton;
    private JLabel titleLabel, semesterLabel;
    private JComboBox cmbx;
    private Font f, font;
    private ImageIcon img;
    private String[] semesterInfo = {"Spring 2018", "Summer 2018", "Fall 2018", "Spring 2019",
        "Summer 2019", "Fall 2019","Spring 2020","Summer 2020",};

    Semester() {
        super("Semester Info");
        initComponents();
    }

    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setLayout(null);
        this.setBounds(200, 100, 700, 430);
        //this.setBackground(Color.GREEN);

        img = new ImageIcon(getClass().getResource("semester.png"));
        this.setIconImage(img.getImage());
        
        f = new Font("Times New Roman", Font.BOLD, 22);
        font = new Font("Times New Roman", Font.BOLD + Font.ITALIC, 28);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);

        titleLabel = new JLabel("SEMESTER");
        titleLabel.setFont(font);
        titleLabel.setBounds(220, 10, 250, 30);
        c.add(titleLabel);

        semesterLabel = new JLabel("Please select the semester:");
        semesterLabel.setFont(f);
        semesterLabel.setBounds(20, 100, 360, 50);
        c.add(semesterLabel);

        cmbx = new JComboBox(semesterInfo);
        cmbx.setFont(f);
        cmbx.setSelectedItem("Summer2018");
        cmbx.setBounds(340, 100, 320, 50);
        //cmbx.setEditable(true);//editable to combo box
        c.add(cmbx);

        backButton = new JButton("Back");
        backButton.setFont(f);
        backButton.setForeground(Color.GREEN);
        backButton.setBounds(260, 220, 120, 50);
        c.add(backButton);

        cmbx.addActionListener(this);
        backButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == cmbx) {
            dispose();
            Preadvising pre = new Preadvising();
            pre.setVisible(true);
        } else if (e.getSource()
                == backButton) {
            dispose();
            Student s = new Student();
            s.setVisible(true);
        }

    }

   /* public static void main(String[] args) {
        Semester s = new Semester();
        s.setVisible(true);
    }*/
}
