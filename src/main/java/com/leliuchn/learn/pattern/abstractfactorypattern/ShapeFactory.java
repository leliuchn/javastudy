package com.leliuchn.learn.pattern.abstractfactorypattern;

/**
 * Created by leliuchn on 16/11/15.
 */

///工厂类，不同的场景使用不同的类，天天特价项目里就是使用这个模式
public class ShapeFactory extends AbstractFactory{

    @Override
    Color getColor(String color) {
        return null;
    }

    public Shape getShape(String shapeType)
    {
        if(shapeType == null)
        {
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        else if(shapeType.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        else if(shapeType.equalsIgnoreCase("SQUARE"))
            return new Square();
        return null;
    }
}
