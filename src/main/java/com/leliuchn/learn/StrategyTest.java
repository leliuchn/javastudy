package com.leliuchn.learn;

/**
 * Created by leliuchn on 16/11/3.
 */

interface CalcStrategy{
    int calc(int x,int y);
}

class Calculator{

    private int x = 0;
    private int y = 0;
    private CalcStrategy strategy = null;


    public  Calculator(int x,int y)
    {
        this.x = x;
        this.y = y;
    }

    public Calculator(int x,int y, CalcStrategy strategy)
    {
        this(x,y);
        this.strategy = strategy;
    }

    ///给定默认的执行方法
    public int calc(int x,int y)
    {
        return x + y;
    }

    //如果有其他的策略则使用具体策略来执行
    public int result()
    {
        if(null != strategy)
        {
            return strategy.calc(x,y);
        }

        return calc(x,y);
    }

}


class AddStrategy implements CalcStrategy{

    public int calc(int x,int y)
    {
        return x+y;
    }
}

class SubStrategy implements CalcStrategy{

    public int calc(int x,int y)
    {
        return x-y;
    }
}


public class StrategyTest {

    public static void main(String args[])
    {
        System.out.println(Thread.currentThread());
        Calculator c = new Calculator(30,24);
        System.out.println(c.result());

        Calculator c1 = new Calculator(10,30,new SubStrategy());
        System.out.println(c1.result());

        ///使用匿名类去实现calcStrategy的接口
        Calculator c2 = new Calculator(30, 40, new CalcStrategy() {
            public int calc(int x, int y) {
                return ((x+10)-(y*3))/2;
            }
        });

        System.out.println(c2.result());
    }
}
