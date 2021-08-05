package com.kubradaskin.multithreading;

public class Counter {

    int count;
    public synchronized void increment(){
        System.out.println(count++);
    }
}
