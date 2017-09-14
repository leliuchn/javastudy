package com.leliuchn.learn.pattern.prototypepattern;


/**
 * Created by leliuchn on 16/11/17.
 */
public class Circle extends Shape{

    public Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
