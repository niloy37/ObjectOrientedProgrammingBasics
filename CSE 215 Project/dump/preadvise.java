import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Preadvise extends JFrame implements ActionListener {
private String s,s1,s2,s3,s4;
private JTextField f,f1,f2,f3,f4;
private Container c;
private JLabel l,l2,l3,l4,l5;






    Preadvise(String s,String s1,String s2,String s3,String s4){
        this.s=s;
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
        this.s4=s4;
       initComponent();
    }

    public void initComponent(){


        this.setSize(600,600);
        this.setResizable(false);
        c = this.getContentPane();
        c.setBackground(Color.lightGray);
        c.setLayout(null);


        l5 = new JLabel(" Student Details for Preadvising");
        l5.setBounds(170,-10,250,50);
        c.add(l5);

        //name
        l = new JLabel("Name :");
        l.setBounds(20, 90, 120, 30);
        c.add(l);


        //phoneNumber
        l2 = new JLabel("Phone Number :");
        l2.setBounds(20, 140, 120, 30);
        c.add(l2);


        //CGPA
        l3 = new JLabel("CGPA : ");
        l3.setBounds(20, 190, 120, 30);
        c.add(l3);


        //ID
        l4 = new JLabel("ID :");
        l4.setBounds(20, 240, 120, 30);
        c.add(l4);








    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
