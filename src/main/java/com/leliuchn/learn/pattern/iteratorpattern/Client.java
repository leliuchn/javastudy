package com.leliuchn.learn.pattern.iteratorpattern;

/**
 * Created by leliuchn on 16/11/23.
 */
public class Client {

    public static void main(String args[])
    {
        Aggregate ag = new ConcreteAggregate();
        ag.add("xiaoming");
        ag.add("xiaohong");
        ag.add("xiaogang");
        Iterator it = ag.iterator();
        while(it.hasNext())
        {
            String str = (String)it.next();
            System.out.println(str);
        }
    }
}
