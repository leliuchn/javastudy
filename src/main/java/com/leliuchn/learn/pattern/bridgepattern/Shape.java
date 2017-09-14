package com.leliuchn.learn.pattern.bridgepattern;

/**
 * Created by leliuchn on 16/11/21.
 */
public abstract class Shape {
    protected  DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
