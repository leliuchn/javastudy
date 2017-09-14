package com.leliuchn.learn.pattern.strategypattern;

/**
 * Created by leliuchn on 16/11/23.
 */
public class Context {

    private IStrategy iStrategy;

    public Context(IStrategy iStrategy)
    {
        this.iStrategy = iStrategy;
    }

    public void execute()
    {
        iStrategy.doSomething();
    }
}
