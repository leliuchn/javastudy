package com.leliuchn.learn.pattern.strategypattern;

/**
 * Created by leliuchn on 16/11/23.
 */

/**
 * 1、抽取算法接口
 * 2、每个具体的算法类，实现接口算法
 * 3、Context 封装算法接口对象，根据不同的实例，调用对应的算法实现。
 */


public class Client {

    public static void main(String args[])
    {

        Context context;

        context = new Context(new ConcreteStrategy1());
        context.execute();

        context = new Context(new ConcreteStrategy2());
        context.execute();

    }

}
