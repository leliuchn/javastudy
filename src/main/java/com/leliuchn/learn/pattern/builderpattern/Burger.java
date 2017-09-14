package com.leliuchn.learn.pattern.builderpattern;


/**
 * Created by leliuchn on 16/11/16.
 */
public abstract class Burger implements Item{

    public Packing packing()
    {
        return new Wrapper();
    }

    public abstract float price();
}
