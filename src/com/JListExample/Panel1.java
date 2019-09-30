package com.JListExample;


import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Panel1 extends JPanel {

    public Panel1() {
        this.setBackground(Color.gray);
        setLayout(new BorderLayout());
        setVisible(true);
        add(new JlistPanel());
    }
}

class JlistPanel extends JPanel implements ListSelectionListener{
    public JList studentsList;
    public Students students;
    public JScrollPane scroll;
    public JlistPanel() {
        setBackground(Color.gray);
        setLayout(new FlowLayout());
        students=new Students();
        students.addStudent(new Student("Mohamed","Elqandili",12091));
        students.addStudent(new Student("imad","allouli",12314));
        students.addStudent(new Student("something","else",12456));
        students.addStudent(new Student("amine","elmissaoui",97211));
        studentsList=new JList();
        studentsList.setListData(students.students);
        add(studentsList);
        studentsList.addListSelectionListener(this);
        //Jscroll pane to limit the display of my data
        scroll=new JScrollPane(studentsList);
        studentsList.setVisibleRowCount(3);
        add(scroll);
    }


    @Override
    public void valueChanged(ListSelectionEvent e) {
//        System.out.println(studentsList.getSelectedValuesList());
        List selected=studentsList.getSelectedValuesList();
        for (int i=0;i<selected.size();i++){
            Student s=(Student)selected.get(i);
            s.afficher();
        }
    }
}

