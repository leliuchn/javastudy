package com.leliuchn.learn.pattern.abstractfactorypattern;


/**
 * Created by leliuchn on 16/11/15.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
