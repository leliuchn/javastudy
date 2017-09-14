package com.leliuchn.learn.pattern.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leliuchn on 16/11/23.
 */
public class ConcreteAggregate implements Aggregate{
    private List list = new ArrayList();
    public void add(Object obj) {
        list.add(obj);
    }

    public void remove(Object obj) {
        list.remove(obj);
    }

    public Iterator iterator() {
        return new ConcreteIterator(list);
    }
}
