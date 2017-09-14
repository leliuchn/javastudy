package com.leliuchn.learn.pattern.prototypepattern;

/**
 * Created by leliuchn on 16/11/17.
 */
public abstract class Shape implements Cloneable{
    private String id;
    protected String type;

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public Producer getProducer() {
        return producer;
    }

    private Producer producer = new Producer("nife",10.0f);

    abstract void draw();
    public String getType()
    {
        return type;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public Object clone()
    {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", producer=" + producer.toString() +
                '}';
    }
}
