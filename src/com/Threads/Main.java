package com.Threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread=new MyThread(10,"a",0);
        MyThread myThread2=new MyThread(10,"b",1);

//        MyThread myThread3=new MyThread(20,"c");

        System.out.println("debut");

        myThread.start();
        myThread2.start();


        myThread.join();
        myThread2.join();


//        Thread.sleep(100);

        System.out.println("\nfin");


        // attendre jusqu'a les deux thread ont finis

//        myThread.join();
//        myThread2.join();
//        myThread3.start();


    }
}
