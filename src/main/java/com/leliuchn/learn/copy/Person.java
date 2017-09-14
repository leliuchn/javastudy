package com.leliuchn.learn.copy;

/**
 * Created by leliuchn on 16/11/17.
 */
public class Person {

    private String name;
    private String sex;
    private int age;

    public Person(String name,String sex,int age)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Person(Person person)
    {
        this.name = person.name;
        this.sex = person.sex;
        this.age = person.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String args[])
    {
        Person person1 = new Person("liule","male",27);
        System.out.println(person1.toString());

        Person person2 = new Person(person1);
        System.out.println(person2.toString());


        person2.setName("liuna");
        System.out.println(person2.toString());

        System.out.println(person1.toString());

    }
}
