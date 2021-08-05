package com.kubradaskin.multithreading;

public class Application {

    public static void main(String[] args) {

        Is is = new Is();

        Thread t1 = new Thread(is);
        Thread t2 = new Thread(is);

        t1.start();
        t2.start();
    }
}