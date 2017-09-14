package com.leliuchn.learn.pattern.bridgepattern;

/**
 * Created by leliuchn on 16/11/21.
 */
public class GreenCircle implements DrawAPI{
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
