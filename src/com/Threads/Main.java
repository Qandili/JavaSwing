package com.Threads;

public class Main {
    public static void main(String[] args) {
        MyThread myThread=new MyThread(10,"bonjour");
        MyThread myThread2=new MyThread(3,"Bonsoir");
        MyThread myThread3=new MyThread(20,"Bonne nuit");
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("debut ");
        myThread.start();
        myThread2.start();
        myThread3.start();
        System.out.println("fin ");

    }
}
