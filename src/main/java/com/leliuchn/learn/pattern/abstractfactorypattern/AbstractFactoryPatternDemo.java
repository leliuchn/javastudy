package com.leliuchn.learn.pattern.abstractfactorypattern;

/**
 * Created by leliuchn on 16/11/15.
 */
public class AbstractFactoryPatternDemo {

    ////从shape factory 和 color factory看，抽象工厂模式是工厂模式的进一步抽象
    public static void main(String [] args)
    {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();


        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color1 = colorFactory.getColor("RED");
        color1.fill();

        Color color2 = colorFactory.getColor("GREEN");
        color2.fill();

        Color color3 = colorFactory.getColor("BLUE");
        color3.fill();


    }
}
