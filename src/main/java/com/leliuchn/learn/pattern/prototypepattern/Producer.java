package com.leliuchn.learn.pattern.prototypepattern;

/**
 * Created by leliuchn on 16/11/17.
 */
public class Producer {
    private String name;

    public Producer(String name,float price)
    {
        this.name = name;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private float price;

    @Override
    public String toString() {
        return "Producer{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
