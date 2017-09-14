package com.leliuchn.learn.pattern.prototypepattern;


/**
 * Created by leliuchn on 16/11/17.
 */
public class Square extends Shape{

    public Square(){
        type = "Square";
    }

    @Override
    void draw() {

        System.out.println("Inside Square::draw() method.");

    }
}
