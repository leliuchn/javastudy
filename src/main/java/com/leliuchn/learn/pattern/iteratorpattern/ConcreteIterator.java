package com.leliuchn.learn.pattern.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leliuchn on 16/11/23.
 */
public class ConcreteIterator implements Iterator{
    private List list = new ArrayList();
    private int cursor = 0;

    public ConcreteIterator(List list)
    {
        this.list = list;
    }
    public Object next() {
        Object obj = null;
        if(this.hasNext())
        {
            obj = this.list.get(cursor++);
        }

        return obj;
    }

    public boolean hasNext() {
        if(cursor == list.size())
            return false;
        return true;
    }
}
