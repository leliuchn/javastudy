package com.leliuchn.learn.pattern.prototypepattern;


import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by leliuchn on 16/11/17.
 */
public class ShapeCache {

    private static Hashtable<String,Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId)
    {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone(); /////通过实现clone方法，对对象进行浅copy。如果拷贝获得对象有引用成员变量，原型可能会被更改掉，慎重。
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }

    public static void showShapeCache()
    {
        Enumeration e = shapeMap.keys();
        while (e.hasMoreElements()){
            System.out.println(shapeMap.get(e.nextElement()).toString());
        }
    }

}
