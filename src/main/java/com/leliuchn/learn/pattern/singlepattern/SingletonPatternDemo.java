package com.leliuchn.learn.pattern.singlepattern;

/**
 * Created by leliuchn on 16/11/15.
 */
public class SingletonPatternDemo {

    SingleObject singleObject = null;

    public SingletonPatternDemo()
    {
        singleObject = SingleObject.getInstance();
    }

    public static void main(String [] args)
    {
        SingletonPatternDemo singletonPatternDemo = new SingletonPatternDemo();
        singletonPatternDemo.singleObject.showMessage();
//        SingleObject object = new SingleObject();
//        SingleObject object = SingleObject.getInstance();
//        object.showMessage();
    }
}
