package com.leliuchn.learn.pattern.iteratorpattern;

/**
 * Created by leliuchn on 16/11/23.
 */
public interface Aggregate {

    public void add(Object obj);
    public void remove(Object obj);
    public Iterator iterator();
}
