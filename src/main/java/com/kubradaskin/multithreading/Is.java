package com.kubradaskin.multithreading;

public class Is extends Thread{

    Counter c=new Counter();

    @Override
    public void run(){
        for(int i=0; i<100; i++){
            c.increment();

        }
    }
}
