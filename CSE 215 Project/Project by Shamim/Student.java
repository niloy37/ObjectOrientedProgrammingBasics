package studentmanagementsystem;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Student extends JFrame implements ActionListener {

    private Container c;
    private JScrollPane scroll;
    private JComboBox cmbx;
    private JLabel label, idLabel, firstNameLabel, lastNameLabel, phoneLabel, deptLabel, cgpaLabel,
            semesterLabel;
    private JTextField tfId, tfName1, tfName2, tfPhone, tfDept, tfCGPA, tfSemester;
    private JButton addButton, updateButton, deleteButton, preAdvisingButton, saveButton,
            clearButton, exitButton;
    private JTable table;
    private JTableHeader header;
    private DefaultTableModel model;
    private Font f, font;
    private ImageIcon img;
    private String[] col = {"Id", "First Name", "Last Name", "Phone", "Department", "CGPA", "Semester"};
    private String[] row = new String[7];
    private String[] semesters = {"Fall", "Spring", "Summer"};

    Student() {
        super("Student Management System");
        studentComponents();
    }

    public void studentComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 970, 920);
        this.setTitle("Student Management System");

        c = this.getContentPane();//assign to JFrame content pane in container object 
        c.setLayout(null);
        c.setBackground(Color.YELLOW);

        img = new ImageIcon(getClass().getResource("student.png"));
        this.setIconImage(img.getImage());

        f = new Font("Times New Roman", Font.BOLD, 20);
        font = new Font("Times New Roman", Font.BOLD, 36);

        label = new JLabel("Student Registration");
        label.setFont(font);
        label.setBounds(280, 20, 350, 50);
        c.add(label);

        idLabel = new JLabel("Id:");
        idLabel.setFont(f);
        idLabel.setBounds(20, 120, 180, 40);
        c.add(idLabel);

        tfId = new JTextField();
        tfId.setFont(f);
        tfId.setBounds(170, 120, 200, 40);
        c.add(tfId);

        addButton = new JButton("Add");
        addButton.setFont(f);
        addButton.setBounds(400, 120, 120, 40);
        c.add(addButton);

        firstNameLabel = new JLabel("First Name:");
        firstNameLabel.setFont(f);
        firstNameLabel.setBounds(20, 180, 180, 40);
        c.add(firstNameLabel);

        tfName1 = new JTextField();
        tfName1.setFont(f);
        tfName1.setBounds(170, 180, 200, 40);
        c.add(tfName1);

        updateButton = new JButton("Update");
        updateButton.setFont(f);
        updateButton.setBounds(400, 180, 120, 40);
        c.add(updateButton);

        lastNameLabel = new JLabel("Last Name:");
        lastNameLabel.setFont(f);
        lastNameLabel.setBounds(20, 240, 180, 40);
        c.add(lastNameLabel);

        tfName2 = new JTextField();
        tfName2.setFont(f);
        tfName2.setBounds(170, 240, 200, 40);
        c.add(tfName2);

        preAdvisingButton = new JButton("Pre-Advising");
        preAdvisingButton.setFont(f);
        preAdvisingButton.setBounds(400, 240, 170, 40);
        c.add(preAdvisingButton);

        phoneLabel = new JLabel("Phone:");
        phoneLabel.setFont(f);
        phoneLabel.setBounds(20, 300, 180, 40);
        c.add(phoneLabel);

        tfPhone = new JTextField();
        tfPhone.setFont(f);
        tfPhone.setBounds(170, 300, 200, 40);
        c.add(tfPhone);

        saveButton = new JButton("Save");
        saveButton.setFont(f);
        saveButton.setBounds(400, 300, 120, 40);
        c.add(saveButton);

        deptLabel = new JLabel("Department:");
        deptLabel.setFont(f);
        deptLabel.setBounds(20, 360, 180, 40);
        c.add(deptLabel);

        tfDept = new JTextField();
        tfDept.setFont(f);
        tfDept.setBounds(170, 360, 200, 40);
        c.add(tfDept);

        deleteButton = new JButton("Delete");
        deleteButton.setFont(f);
        deleteButton.setBounds(400, 360, 120, 40);
        c.add(deleteButton);

        cgpaLabel = new JLabel("CGPA:");
        cgpaLabel.setFont(f);
        cgpaLabel.setBounds(20, 420, 180, 40);
        c.add(cgpaLabel);

        tfCGPA = new JTextField();
        tfCGPA.setFont(f);
        tfCGPA.setBounds(170, 420, 200, 40);
        c.add(tfCGPA);

        clearButton = new JButton("Clear");
        clearButton.setFont(f);
        clearButton.setBounds(400, 420, 120, 40);
        c.add(clearButton);

        semesterLabel = new JLabel("Semester:");
        semesterLabel.setFont(f);
        semesterLabel.setBounds(20, 480, 180, 40);
        c.add(semesterLabel);

        cmbx = new JComboBox(semesters);
        cmbx.setFont(f);
        cmbx.setSelectedItem("Spring");
        cmbx.setBounds(170, 480, 200, 40);
        //cmbx.setEditable(true);//editable to combo box
        c.add(cmbx);

        exitButton = new JButton("Exit");
        exitButton.setFont(f);
        exitButton.setBounds(400, 480, 120, 40);
        c.add(exitButton);

        table = new JTable();

        model = new DefaultTableModel();
        model.setColumnIdentifiers(col);
        table.setModel(model);
        table.setFont(f);
        table.setDefaultEditor(Object.class, null);//now table not editable
        table.setSelectionBackground(Color.GREEN);
        table.setBackground(Color.WHITE);
        table.setRowHeight(35);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);//set to table auto resize mode off
        table.getColumnModel().getColumn(0).setPreferredWidth(120);//set to the column width
        table.getColumnModel().getColumn(1).setPreferredWidth(150);
        table.getColumnModel().getColumn(2).setPreferredWidth(150);
        table.getColumnModel().getColumn(3).setPreferredWidth(150);
        table.getColumnModel().getColumn(4).setPreferredWidth(100);
        table.getColumnModel().getColumn(5).setPreferredWidth(100);
        table.getColumnModel().getColumn(6).setPreferredWidth(150);

        //change to table header font and color
        header = table.getTableHeader();
        header.setFont(new Font("Imes New Roman", Font.BOLD, 14));
        header.setBackground(Color.WHITE);

        scroll = new JScrollPane(table);//add to table in scroll pane
        scroll.setFont(f);
        scroll.setBounds(10, 540, 925, 290);
        c.add(scroll);

        // (header.getDefaultRenderer())
        //ActionListentener
        addButton.addActionListener(this);
        updateButton.addActionListener(this);
        preAdvisingButton.addActionListener(this);
        saveButton.addActionListener(this);
        deleteButton.addActionListener(this);
        clearButton.addActionListener(this);
        exitButton.addActionListener(this);

        //MouseListener
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent m) {
                int numberOfRows = table.getSelectedRow();
                //getValueAt() method return object. so convert to String using toString() method
                String id = model.getValueAt(numberOfRows, 0).toString();
                String name1 = model.getValueAt(numberOfRows, 1).toString();
                String name2 = model.getValueAt(numberOfRows, 2).toString();
                String phone = model.getValueAt(numberOfRows, 3).toString();
                String dept = model.getValueAt(numberOfRows, 4).toString();
                String cgpa = model.getValueAt(numberOfRows, 5).toString();
                String semesters = model.getValueAt(numberOfRows, 6).toString();

                tfId.setText(id);
                tfName1.setText(name1);
                tfName2.setText(name2);
                tfPhone.setText(phone);
                tfDept.setText(dept);
                tfCGPA.setText(cgpa);
                cmbx.setSelectedItem(semesters);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == addButton) {
            if (tfId.getText().isEmpty() || tfName1.getText().isEmpty() || tfPhone.getText().isEmpty()
                    || tfDept.getText().isEmpty() || tfCGPA.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "please enter  data in JTextField");

            } else {
                try {
                    row[0] = String.valueOf(Integer.parseInt(tfId.getText()));
                    row[1] = tfName1.getText();
                    row[2] = tfName2.getText();
                    row[3] = String.valueOf(Integer.parseInt(tfPhone.getText()));
                    row[4] = tfDept.getText();
                    row[5] = String.valueOf(Double.parseDouble(tfCGPA.getText()));
                    row[6] = cmbx.getSelectedItem().toString();
                    model.addRow(row);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "you enter wrong data");
                }

            }

        } else if (e.getSource() == updateButton) {
            int numberOfRow = table.getSelectedRow();
            try {
                String Id = tfId.getText();
                String Name1 = tfName1.getText();
                String Name2 = tfName2.getText();
                String phones = tfPhone.getText();
                String Dept = tfDept.getText();
                String Cgpa = tfCGPA.getText();
                String Semester = cmbx.getSelectedItem().toString();

                model.setValueAt(Id, numberOfRow, 0);
                model.setValueAt(Name1, numberOfRow, 1);
                model.setValueAt(Name2, numberOfRow, 2);
                model.setValueAt(phones, numberOfRow, 3);
                model.setValueAt(Dept, numberOfRow, 4);
                model.setValueAt(Cgpa, numberOfRow, 5);
                model.setValueAt(Semester, numberOfRow, 6);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "No row has been selected or row exits");
            }

        } else if (e.getSource() == preAdvisingButton) {
            if (table.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(null, "No row has been selected or row exits");
            } else {
                String id = tfId.getText();
                String Cgpa = tfCGPA.getText();
                File fq = new File("Advising Id and CGPA.txt");
                try {
                    PrintWriter writer = new PrintWriter(fq);
                    writer.printf("%s  %s", id, Cgpa);
                    writer.close();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "ERROR");

                }
                dispose();
                Semester s = new Semester();
                s.setVisible(true);
            }

        } else if (e.getSource() == saveButton) {

            try {
                File fp = new File("student.txt");//create file
                if (!fp.exists()) {
                    fp.createNewFile();
                }

                FileWriter fw = new FileWriter(fp.getAbsoluteFile());//getAbsoulateFile mean to student.txt
                BufferedWriter bw = new BufferedWriter(fw);
                for (int i = 0; i < table.getRowCount(); i++) {
                    for (int j = 0; j < table.getColumnCount(); j++) {
                        bw.write(table.getModel().getValueAt(i, j) + " ");
                    }
                    bw.write("\r\n\n");
                    bw.write("\r\n\n");
                }
                bw.close();
                fw.close();
                JOptionPane.showMessageDialog(null, "Data save successfully");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERROR");
            }
        } else if (e.getSource() == deleteButton) {

            int numberOfRow = table.getSelectedRow();

            if (numberOfRow >= 0) {

                model.removeRow(numberOfRow);

            } else {
                JOptionPane.showMessageDialog(null, "Unable to Delete");
            }
        } else if (e.getSource() == clearButton) {
            tfId.setText("");
            tfName1.setText("");
            tfName2.setText("");
            tfPhone.setText("");
            tfDept.setText("");
            tfCGPA.setText("");
            cmbx.setSelectedItem(1);
        } else if (e.getSource() == exitButton) {
            System.exit(0);
        }

    }

    /*public static void main(String[] args) {
        Student s = new Student();
        s.setVisible(true);
    }*/
}
