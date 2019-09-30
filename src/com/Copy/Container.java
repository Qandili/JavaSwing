package com.Copy;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

public class Container extends JFrame {
    public Container() throws HeadlessException {
        super();
        setTitle("Copy");
        setBounds(0,0,500,600);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        add("North",new Pannel());
        add("Center",new Password());
        setVisible(true);

    }
}
class Password extends JPanel implements ItemListener,KeyListener{
    public JPasswordField passwordField;
    public JCheckBox show;
    public String cache;
    public Password() {
        setLayout(new FlowLayout());
        passwordField=new JPasswordField(15);
        show=new JCheckBox("Show password");
        show.addItemListener(this);
        add(passwordField);
        add(show);
        passwordField.isDisplayable();
        passwordField.addKeyListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        System.out.println("hey"+e.getStateChange());
        if (show.isSelected()){
            passwordField.setEchoChar((char) 0);
        }else {
            passwordField.setEchoChar('●');
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        this.cache=String.valueOf(passwordField.getPassword());
        System.out.println("cache  ...."+cache);
        StringBuilder sb = new StringBuilder(cache);
        if (!this.cache.matches("^[0-9]*$")){
                System.out.println("it dosn't match that");
                sb.deleteCharAt(cache.length()-1);
                cache=new String(sb);
                passwordField.setText(cache);
                System.out.println("cache is : " + cache);
        }
    }
}
class Pannel extends JPanel implements ActionListener,KeyListener{
    JButton copy;
    JTextField origin;
    JTextField thecopy;
    public Pannel() {
        setLayout(new FlowLayout());
        copy=new JButton("copy");
        origin=new JTextField("Welcome to Javatpoint.");
        origin.setBounds(50,100, 200,30);
        thecopy=new JTextField(20);
        thecopy.setSize(40,10);
        thecopy.setEditable(false);
        copy.addActionListener(this);
        origin.addKeyListener(this);
        add(origin);
        add(copy);
        add(thecopy);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String copied=origin.getText();
        thecopy.setText(copied);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        String copied=origin.getText();
        thecopy.setText(copied);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        String copied=origin.getText();
        thecopy.setText(copied);
    }
}
