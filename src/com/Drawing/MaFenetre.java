package com.Drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MaFenetre extends JFrame  implements MouseListener,MouseMotionListener {

    Panel1 jPanel;
    int counter;
    int xpressed;
    int ypressed;
    int xreleased;
    int yreleased;
    boolean released=false;
    public MaFenetre() throws HeadlessException {

        super();
        this.setTitle("Let's draw");
        this.setBounds(100,100,500,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        jPanel=new Panel1();
        this.add(jPanel);
        addMouseListener(this);
        addMouseMotionListener(this);


    }

    @Override
    public void mouseClicked(MouseEvent e) {


    }

    @Override
    public void mousePressed(MouseEvent e) {
        Point point=MouseInfo.getPointerInfo().getLocation();
        System.out.println("pressed");
        xpressed=e.getX();
        ypressed=e.getY();
            this.repaint();

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        released=true;
        System.out.println("released");
        xreleased=e.getX();
        yreleased=e.getY();
        this.jPanel.getGraphics().drawLine(xpressed,ypressed,xreleased,yreleased);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("exited");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("dragged");
        Point point=MouseInfo.getPointerInfo().getLocation();
        System.out.println(point);
        this.jPanel.paintComponent(jPanel.getGraphics());
        this.jPanel.getGraphics().drawLine(xpressed,ypressed,point.x,point.y);



    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}
