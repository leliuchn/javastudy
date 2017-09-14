package com.leliuchn.learn;

/**
 * Created by leliuchn on 16/11/3.
 */

class TicketWindow extends Thread{


    static int max_value = 0; //static 伴随着jvm的销毁而结束，可以实现线程级别的数据共享，但是生命周期太长
    @Override
    public void run()
    {
        while(true)
        {
            if(max_value > 20)
            {
                break;
            }
            System.out.println(currentThread().getName()+":"+max_value++);
        }

    }


}

public class Bank {

    public static void main(String args[])
    {
        TicketWindow ticketWindow1 = new TicketWindow();
        TicketWindow ticketWindow2 = new TicketWindow();
        TicketWindow ticketWindow3 = new TicketWindow();
        ticketWindow1.start();
        ticketWindow2.start();
        ticketWindow3.start();


    }
}
