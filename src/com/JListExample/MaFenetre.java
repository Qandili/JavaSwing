package com.JListExample;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuKeyEvent;
import javax.swing.event.MenuKeyListener;
import javax.swing.event.MenuListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MaFenetre extends JFrame{

    public MaFenetre() throws HeadlessException {

        super();
//        String title=JOptionPane.showInputDialog(this,"Title please");
        this.setTitle("List example");
//        String width=JOptionPane.showInputDialog(this,"width please?");
//        String height=JOptionPane.showInputDialog(this,"height please?");
//        this.setBounds(100,100,Integer.parseInt(width),Integer.parseInt(height));
        this.setBounds(100,100,500,500);
        setBackground(Color.gray);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.add(new Panel1());
        setJMenuBar(new MenuBar());
        this.setVisible(true);

    }


}
class MenuBar extends JMenuBar implements ActionListener{
    JMenu java;
    JMenuItem swing;
    JMenuItem event;
    JMenu cSharp;
    JMenuItem graphics;
    JMenuItem threads;
    public MenuBar() {
        java=new JMenu("java");
        swing=new JMenuItem("swing",KeyEvent.VK_H);
        event=new JMenuItem("Event");
        java.add(swing);
        java.add(event);
        cSharp=new JMenu("cSharp");
        graphics=new JMenuItem("graphics");
        threads=new JMenuItem("threads");
        cSharp.add(graphics);
        cSharp.add(threads);
        add(java);
        add(cSharp);
        setVisible(true);
        swing.addActionListener(this);
        event.addActionListener(this);
        graphics.addActionListener(this);
        threads.addActionListener(this);
        swing.setMnemonic(KeyEvent.VK_H);
        swing.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,ActionEvent.ALT_MASK));


    }





    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==swing){
            System.out.println("hello");
            JOptionPane.showMessageDialog(this,"you chosen swing");
        }else if (e.getSource()==event){
            JOptionPane.showMessageDialog(this,"you chosen event");

        }else if (e.getSource()==graphics){
            JOptionPane.showMessageDialog(this,"you chosen graphics");

        }else if (e.getSource()==threads){
            JOptionPane.showMessageDialog(this,"you chosen threads");

        }
    }

}
