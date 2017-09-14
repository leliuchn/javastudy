package com.leliuchn.learn.pattern.abstractfactorypattern;

/**
 * Created by leliuchn on 16/11/15.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice)
    {
        if(choice.equalsIgnoreCase("SHAPE"))
        {
            return new ShapeFactory();
        }else if(choice.equalsIgnoreCase("COLOR"))
        {
            return new ColorFactory();
        }
        return null;
    }
}
