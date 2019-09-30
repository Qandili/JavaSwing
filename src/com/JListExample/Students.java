package com.JListExample;

import java.util.ArrayList;
import java.util.Vector;

public class Students {
    Vector<Student> students;

    public Students() {
        students=new Vector<>();
    }

    public void getStudent(int i){
        students.get(i).afficher();
    }
    public void addStudent(Student student){
        students.add(student);
    }

}
