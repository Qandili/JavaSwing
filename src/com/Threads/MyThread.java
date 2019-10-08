package com.Threads;

public class MyThread extends Thread {
    int count;
    String message;
    public MyThread(int count,String s) {
        super();
        this.count=count;
        this.message=s;
    }
    public void runNumber(int count,String string){
        for (int i = 0; i <count ; i++) {
            System.out.println(string);
        }
    }
    @Override
    public void run() {
        super.run();
        runNumber(count,message);
    }

}
