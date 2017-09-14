package com.leliuchn.learn.pattern.bridgepattern;

/**
 * Created by leliuchn on 16/11/21.
 */
///抽象 和 实现分离，二者分别可以独立变化。
public class BridgePatternDemo {

    public static void main(String args[])
    {
        Shape redCircle = new Circle(100,100,10,new RedCircle());
        Shape greenCircle = new Circle(100,100,10,new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
