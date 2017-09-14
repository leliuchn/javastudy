package com.leliuchn.learn.pattern.prototypepattern;

/**
 * Created by leliuchn on 16/11/17.
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        ShapeCache.showShapeCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        clonedShape.getProducer().setName("wood");
        ShapeCache.showShapeCache();


        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
