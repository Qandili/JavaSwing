package com.JListExample;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        MaFenetre fenetre=new  MaFenetre();
        System.out.println("avantmessage");

        int response=JOptionPane.showConfirmDialog(fenetre,"do u wish to quit?");

        System.out.println(" response is "+response);
        if (response==-1 || response==0){
            fenetre.setVisible(false);
        }
        System.out.println("avantmessage");
    }
}
