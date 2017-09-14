package com.leliuchn.learn;

/**
 * Created by leliuchn on 16/11/3.
 */
class TicketWindow2 implements Runnable
{
    private int max_value = 0;
    public void run() {
        while(true) {
            if(max_value>50) break;
            System.out.println(Thread.currentThread().getName()+":"+max_value++);
        }
    }
}


//runnable 给业务类实现了可以多线程执行的接口，然后使用thread类封装业务类去执行，从而将业务逻辑类和多线程分离出来，太赞了。
public class Bank2 {

    public static void main(String args[])
    {
        TicketWindow2 tw2 = new TicketWindow2();//1

        Thread t1 = new Thread(tw2);//2
        Thread t2 = new Thread(tw2);//3
        Thread t3 = new Thread(tw2);//4

        t1.start();
        t2.start();
        t3.start();
    }

    ///可以不使用静态数据类型，可以保证线程共享同一份数据，多个线程共享一个类对象里面的一份数据
}
