package com.leliuchn.learn;

/**
 * Created by leliuchn on 16/11/3.
 */
class ThreadDemo extends Thread{

    private final static int DEFAULT_VALUE = 100;
    private int maxValue = 0; private String threadName = "";

    public ThreadDemo(String threadName) {
        this(threadName,DEFAULT_VALUE);
    }

    public ThreadDemo(String threadName, int defaultValue) {
        this.maxValue = defaultValue;
        this.threadName = threadName; }

    @Override
    public void run()
    {
        int i = 0;
        while(i < maxValue)
        {
            i++;
            System.out.println("Thread:"+threadName+":"+i);
        }
    }
}



public class ThreadTest{

    public static void main(String args[])
    {
        ThreadDemo threadDemo1 = new ThreadDemo("t1");
        ThreadDemo threadDemo2 = new ThreadDemo("t2",200);
        threadDemo1.start();
        threadDemo2.start();
    }
}
