package com.leliuchn.learn.pattern.builderpattern;

/**
 * Created by leliuchn on 16/11/16.
 */
public abstract class ColdDrink implements Item{


    public Packing packing() {
        return new Bottle();
    }


    public abstract float price();
}

///使用接口来向上兼容，item可以理解是最抽象的类。