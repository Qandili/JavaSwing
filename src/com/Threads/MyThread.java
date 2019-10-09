package com.Threads;

public class MyThread extends Thread {
    int count;
    int time;
    String message;
    public MyThread(int count,String s,int time) {
        super();
        this.count=count;
        this.message=s;
        this.time=time;
    }
    public void runNumber(int count,String string) throws InterruptedException {
        for (int i = 0; i <count ; i++) {
//            if (i==10 && message.equalsIgnoreCase("a")){
//                sleep(1);
//            }
//            if (i==8)
            if (string.equalsIgnoreCase("a"))
                System.err.print(string+" ");
            else
            System.out.print(string+" ");
        }
    }
    @Override
    public void run() {
        super.run();
        try {
            runNumber(count,message);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
