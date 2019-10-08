package com.DialogExample;

import javax.swing.*;
import java.awt.*;

public class MaFenetre extends JFrame {

    public MaFenetre() throws HeadlessException {

        super();
        this.setTitle("evenement");
        this.setBounds(100,100,500,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.add(new Panel1());
        this.setVisible(true);

    }
}
