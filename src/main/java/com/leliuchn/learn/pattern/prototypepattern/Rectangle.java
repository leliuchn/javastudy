package com.leliuchn.learn.pattern.prototypepattern;


/**
 * Created by leliuchn on 16/11/17.
 */
public class Rectangle extends Shape{

    public Rectangle()
    {
        type = "Rectangle";
    }

    @Override
    void draw() {

        System.out.println("Inside Rectangle::draw() method.");
    }
}
