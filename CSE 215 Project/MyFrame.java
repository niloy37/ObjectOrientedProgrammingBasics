import java.awt.font.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;




public class MyFrame extends JFrame implements ActionListener{

    //instance variables
    private JLabel label,firstname,lastname,phonenumber,CGPA,id;
    private JTable table;
    private JButton add,update,clear,exit;
    private JTextField text,text2,text3,text4,text5;
    private JPasswordField pass;
    private JScrollPane scroll;
    private Container c;
    private Font f,font;
    private DefaultTableModel model;
    private String [] col = {"First Name","Last Name","Phone Number","CGPA","ID"};
    private String [] row = new String[5];






    MyFrame() {
        super("Student Form Registration");
        GUI();

    }

    public void GUI() {



        //frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,800);
        this.setVisible(true);


        //container

        c= this.getContentPane();
        c.setBackground(Color.LIGHT_GRAY);


        //layout
        c.setLayout(null);

        //font
        f = new Font("Ariel",Font.BOLD,18);
        font = new Font("Moncao",Font.BOLD,18);


        //Label

        label = new JLabel("Student Registration");
        label.setFont(f);
        label.setBounds(170,-10,250,50);
        c.add(label);
        label.setToolTipText("Title : Student Registration Form");

        //firstname
        firstname = new JLabel("First Name :");
        firstname.setToolTipText("Enter first name");
        firstname.setBounds(20, 90, 120, 30);
        c.add(firstname);



        //textfield1

        text = new JTextField();
        text.setBounds(150,90,120,30);
        c.add(text);
        text.addActionListener(this);



        //lastname

        lastname = new JLabel("Enter Last Name: ");
        lastname.setToolTipText("Enter last name");
        lastname.setBounds(20,140,120,30);
        c.add(lastname);



        //text2
        text2 = new JTextField();
        text2.setBounds(150,140,120,30);
        c.add(text2);
        text2.addActionListener(this);




        //label phonenumber
        phonenumber = new JLabel("Phone Number : ");
        phonenumber.setToolTipText("Enter Phone number");
        phonenumber.setBounds(20,190,120,30);
        c.add(phonenumber);

        //text3
        text3 = new JTextField();
        text3.setBounds(150,190,120,30);
        c.add(text3);
        text3.addActionListener(this);


        //CGPA
        CGPA = new JLabel("CGPA :");
        CGPA.setToolTipText("Enter CGPA :");
        CGPA.setBounds(20,240,120,30);
        c.add(CGPA);


        //text4
        text4 = new JTextField();
        text4.setBounds(150,240,120,30);
        c.add(text4);
        text4.addActionListener(this);


        //ID
        id = new JLabel("ID :");
        id.setToolTipText("Enter ID ");
        id.setBounds(20,290,120,30);
        c.add(id);


        //text5
        text5 = new JTextField();
        text5.setBounds(150,290,120,30);
        c.add(text5);
        text5.addActionListener(this);




        //buttons
        //
        //
        add = new JButton("Add");
        add.setBounds(320,110,100,25);
        c.add(add);
        add.addActionListener(this);

        //update
        update = new JButton("Update");
        update.setBounds(320,160,100,25);
        c.add(update);
        update.addActionListener(this);

        //clear
        clear = new JButton("Clear");
        clear.setBounds(320,210,100,25);
        c.add(clear);
        clear.addActionListener(this);

        //exit
        exit = new JButton("Exit");
        exit.setBounds(320,260,100,25);
        c.add(exit);
        exit.addActionListener(this);




        //table
        table = new JTable();

        model = new DefaultTableModel();
        model.setColumnIdentifiers(col);
        table.setModel(model);
        table.setSelectionBackground(Color.yellow);
        table.setBackground(Color.gray);
        table.setRowHeight(30);
        //scroll pane
        scroll = new JScrollPane(table);
        scroll.setBounds(20,330,500,350);
        c.add(scroll);




    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String str="";

        //exit
        if(e.getSource() == exit){
            int x=JOptionPane.showConfirmDialog(null,"Are you sure you want to Exit?","Exit",JOptionPane.YES_NO_OPTION);
            if(x== JOptionPane.YES_OPTION)
            dispose();

        }

        //clear
        if(e.getSource()== clear){
            text.setText(str);
            text2.setText(str);
            text3.setText(str);
            text4.setText(str);
            text5.setText(str);
        }


        //JOptionView TextFields
        if(e.getSource() == text){
            str = String.format(text.getText());
            JOptionPane.showMessageDialog(null,str);
        }
        if(e.getSource()== text2){
            str= String.format(text2.getText());
            JOptionPane.showMessageDialog(null,text2.getText());
        }
        if(e.getSource()== text3){
            str= String.format(text3.getText());
            JOptionPane.showMessageDialog(null,text3.getText());
        }
        if(e.getSource()== text4){
            str= String.format(text4.getText());
            JOptionPane.showMessageDialog(null,text4.getText());
        }
        if(e.getSource()== text5){
            str= String.format(text5.getText());
            JOptionPane.showMessageDialog(null,text5.getText());
        }
        if(e.getSource()== add){
            row[0] = text.getText();
            row[1] = text2.getText();
            row[2] = text3.getText();
            row[3] = text4.getText();
            row[4] = text5.getText();

            model.addRow(row);
        }

        if(e.getSource() == update){
            int n = table.getSelectedRow();
            String row0 = text.getText();
            String row1 = text2.getText();
            String row2 = text3.getText();
            String row3 = text4.getText();
            String row4 = text5.getText();

            model.setValueAt(row0,n,0);
            model.setValueAt(row1,n,1);
            model.setValueAt(row2,n,2);
            model.setValueAt(row3,n,3);
            model.setValueAt(row4,n,4);

        }


    }



}
