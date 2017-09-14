package com.leliuchn.learn.pattern.templatepattern;

/**
 * Created by leliuchn on 16/11/24.
 */
public class Client {

    public static int[] a = { 10, 32, 1, 9, 5, 7, 12, 0, 4, 3 };
    public static void main(String args[])
    {
        AbstractSort s = new ConcreteSort();
        s.showSortResult(a);

    }
}
