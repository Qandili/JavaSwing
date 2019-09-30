package com.RadioButton;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Panel1 extends JPanel {

    public Panel1() {
        this.setBackground(Color.gray);
        setLayout(new BorderLayout());
        setVisible(true);
        add(new RadioPanel());
    }
}

class RadioPanel extends JPanel implements ActionListener{
    JRadioButton op1;
    JRadioButton op2;
    JRadioButton op3;
    ButtonGroup group;
    public RadioPanel() {
        setLayout(new FlowLayout());
        op1=new JRadioButton("Red");
        op2=new JRadioButton("Blue");
        op3=new JRadioButton("green");
        group=new ButtonGroup();
        group.add(op1);
        group.add(op2);
        group.add(op3);
        add(op1);
        add(op2);
        add(op3);

        op1.addActionListener(this);
        op2.addActionListener(this);
        op3.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==op1){
            this.setBackground(Color.red);
        }else if(e.getSource()==op2){
            this.setBackground(Color.BLUE);
        }else if(e.getSource()==op3){
            this.setBackground(Color.GREEN);
        }
    }
}

