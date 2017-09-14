package com.leliuchn.learn.pattern.singlepattern;

/**
 * Created by leliuchn on 16/11/15.
 */

///单例模式实现方式很多，饿汉模式，经常使用的模式。
public class SingleObject {

    private static SingleObject instance = new SingleObject();

    private SingleObject(){}

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage()
    {
        System.out.println("Hello,world");
    }
}
