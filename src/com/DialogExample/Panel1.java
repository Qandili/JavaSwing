package com.DialogExample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel1 extends JPanel {

    public Panel1() {
        this.setBackground(Color.gray);
        setLayout(new BorderLayout());
        this.add("North",new ButtonsPanel());
        setVisible(true);
    }
}

class ButtonsPanel extends JPanel implements ActionListener{
    JButton plus;
    JButton minest;
    JLabel note;
    public int counter;
    public ButtonsPanel(){
        setLayout(new FlowLayout());
        plus=new JButton("+");
        minest=new JButton("-");
        minest.setEnabled(false);
        note=new JLabel("0");
        counter=0;
        ButtonListener.setCounter(counter);
        plus.addActionListener(new ButtonListener(plus,minest,note));
        minest.addActionListener(new ButtonListener(plus,minest,note));
        add(plus);
        add(note);
        add(minest);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==plus){
            counter++;
        }else if(e.getSource()==minest){
            counter--;
        }
        if (counter>=20){
            plus.setEnabled(false);
        }else {
            plus.setEnabled(true);
        }
        if (counter<=0){
            minest.setEnabled(false);
        }else {
            minest.setEnabled(true);}
        note.setText(String.valueOf(counter));
    }
}

class ButtonListener implements ActionListener{

    public static int counter;
    public JButton plus;
    public JButton moins;
    JLabel note;

    public ButtonListener(JButton plus,JButton moins,JLabel note) {
        this.plus=plus;
        this.moins=moins;
        this.note=note;
    }
    public static void setCounter(int count){
        counter = count;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==plus){
            counter++;
        }else if(e.getSource()==this.moins){
            counter--;
        }
        if (counter>=20){
            plus.setEnabled(false);
        }else {
            plus.setEnabled(true);
        }
        if (counter<=0){
            moins.setEnabled(false);
        }else {
            moins.setEnabled(true);}
        note.setText(String.valueOf(counter));
    }


}



