package com.company;

public class ThreadThread {
    public synchronized void print(){
        for (int i = 0; i < 10 ; i++) {
            System.out.println(Thread.currentThread().getName() + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
