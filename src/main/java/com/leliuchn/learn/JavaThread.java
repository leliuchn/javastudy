package com.leliuchn.learn;

/**
 * Created by leliuchn on 16/11/3.
 */
public class JavaThread extends Thread{


    @Override
    public void run()
    {
        int i = 0;
        while(i < 60)
        {
            System.out.println("i: " + i++);
        }
    }
    ///main 是进程的一个线程
    public static void main(String args[])
    {
        ///两个线程同时执行，多核的情况下，存在并行，单核的话，不存在真正的并发。
        JavaThread javaThread = new JavaThread();
        javaThread.start();

        JavaThread javaThread1 = new JavaThread();
        javaThread1.start();
//        System.out.println("Hello,world");
    }
}
