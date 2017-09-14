package com.leliuchn.learn.pattern.filterpattern;

import java.util.List;

/**
 * Created by leliuchn on 16/11/22.
 */
public class AndCriteria implements Criteria{

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    ///先满足第一个标准，再过滤满足第一个标准的list集合。
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
