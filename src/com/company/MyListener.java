package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyListener implements MouseListener {
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
