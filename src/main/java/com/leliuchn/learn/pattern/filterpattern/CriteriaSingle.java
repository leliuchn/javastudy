package com.leliuchn.learn.pattern.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leliuchn on 16/11/22.
 */
public class CriteriaSingle implements Criteria{

    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
