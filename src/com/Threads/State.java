package com.Threads;

public class State extends Thread{
    String message;
    boolean wait;
    public State(String message,Boolean wait) {
        super();
        this.message=message;
        this.wait=wait;
    }

    @Override
    public void run() {
        super.run();
        try {
            display();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void display() throws InterruptedException {
        if (wait){
            sleep(100);
        }
        System.out.println("\n"+message);


    }

}
