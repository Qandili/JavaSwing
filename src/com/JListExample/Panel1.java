package com.JListExample;


import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

public class Panel1 extends JPanel {

    public Panel1() {
        this.setBackground(Color.gray);
        setLayout(new BorderLayout());
        setVisible(true);
        add(new JlistPanel());
    }
}

class JlistPanel extends JPanel implements ListSelectionListener,ActionListener{
    public JList studentsList;
    public Students students;
    public JScrollPane scroll;
    public JTable studentsTable;
    public JButton add;
    DefaultTableModel studentModel;
//    String[] entetes = {"FirstName", "Name", "CNE"};
    public JlistPanel() {
        setBackground(Color.gray);
        setLayout(new FlowLayout());
        students=new Students();
        students.addStudent(new Student("Mohamed","Elqandili",12091));
        students.addStudent(new Student("imad","allouli",12314));
        students.addStudent(new Student("something","else",12456));
        students.addStudent(new Student("amine","elmissaoui",97211));
        students.addStudent(new Student("pppppp","oooo",97211));
        students.addStudent(new Student("awjaosifha","sckusdhc",97211));
        studentsList=new JList();
        studentsList.setListData(students.students);
        add(studentsList);
        studentsList.addListSelectionListener(this);
        add=new JButton("display");
        //Jscroll pane to limit the display of my data
        scroll=new JScrollPane(studentsList);
        studentsList.setVisibleRowCount(4);
        studentModel=new DefaultTableModel();
        studentModel.addColumn("FirstName");
        studentModel.addColumn("Name");
        studentModel.addColumn("CNE");
        studentsTable=new JTable(studentModel);
        add(scroll);
        add(add);
        add.addActionListener(this);
        add(studentsTable);

    }


    @Override
    public void valueChanged(ListSelectionEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //        System.out.println(studentsList.getSelectedValuesList());
        List selected=studentsList.getSelectedValuesList();
        for (int i=0;i<selected.size();i++){
            Student s=(Student)selected.get(i);
            Vector v=new Vector();
            if (studentExists(s)){
                break;
            }
            v.add(s.firstName);
            v.add(s.lastName);
            v.add(s.cne);
            studentModel.addRow(v);
        }
    }
    public boolean studentExists(Student student){
        String a;
        String b;
        int c;
        for (int i=0;i<studentsTable.getRowCount();i++){
                a=(String) studentsTable.getValueAt(i,0);
                b=(String) studentsTable.getValueAt(i,1);
                c= (int) studentsTable.getValueAt(i,2);
                if (c==(student.cne) && b.equalsIgnoreCase(student.lastName)
                        && a.equalsIgnoreCase(student.firstName)){
                    return true;
                }

        }
        return false;
    }
}

