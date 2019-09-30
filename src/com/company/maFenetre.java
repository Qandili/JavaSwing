package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class maFenetre extends JFrame implements MouseListener {

    public maFenetre() throws HeadlessException {
        super();
        this.setTitle("evenement");
        this.setBounds(100,100,300,400);
        this.setVisible(true);
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked "+"x"+e.getX()+" y"+e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse pressed"+"x"+e.getX()+" y"+e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("mouse released"+"x"+e.getX()+" y"+e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("mouse exited");
    }

}
